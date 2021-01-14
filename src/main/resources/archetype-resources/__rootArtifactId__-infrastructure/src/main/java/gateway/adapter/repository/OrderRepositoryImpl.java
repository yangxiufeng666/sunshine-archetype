#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.gateway.adapter.repository;

import ${package}.gateway.database.OrderInfoPOMapper;
import ${package}.gateway.database.OrderItemPOMapper;
import ${package}.gateway.database.po.OrderInfoPO;
import ${package}.gateway.database.po.OrderItemPO;
import ${package}.gateway.port.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 14:56
 */
@Component
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    private OrderInfoPOMapper orderPOMapper;
    @Autowired
    private OrderItemPOMapper orderItemPOMapper;

    @Override
    public void addOrder(OrderInfoPO orderPO, List<OrderItemPO> itemPOList) {
        orderPOMapper.insert(orderPO);
        orderItemPOMapper.insertAll(itemPOList);
    }
}
