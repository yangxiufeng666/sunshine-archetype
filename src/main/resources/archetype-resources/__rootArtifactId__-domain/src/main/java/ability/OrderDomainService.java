#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ability;

import ${package}.converter.OrderConverter;
import ${package}.event.OrderCreatedEvent;
import ${package}.exception.NotEnoughInventoryException;
import ${package}.model.Order;
import ${package}.gateway.port.client.InventoryClient;
import ${package}.gateway.port.repository.OrderRepository;
import com.dsy.sunshine.core.DomainService;
import com.dsy.sunshine.core.Response;
import com.dsy.sunshine.core.event.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:19
 */
@Component
public class OrderDomainService implements DomainService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InventoryClient inventoryClient;

    @Autowired
    private EventPublisher eventPublisher;

    public void addOrder(Order order){
        Response response = inventoryClient.check();
        if ( !response.isSuccess() ){
            throw new NotEnoughInventoryException("库存不足");
        }
        orderRepository.addOrder(OrderConverter.toDataObject(order) , OrderConverter.toItemDataObject(order));

        OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent(UUID.randomUUID().toString());
        eventPublisher.publish(orderCreatedEvent);
    }

}
