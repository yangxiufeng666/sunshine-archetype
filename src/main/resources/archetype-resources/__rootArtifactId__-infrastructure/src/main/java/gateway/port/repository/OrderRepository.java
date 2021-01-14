#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.gateway.port.repository;

import ${package}.gateway.database.po.OrderInfoPO;
import ${package}.gateway.database.po.OrderItemPO;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 14:47
 */
public interface OrderRepository {

    void addOrder(OrderInfoPO orderPO , List<OrderItemPO> itemPOList);

}
