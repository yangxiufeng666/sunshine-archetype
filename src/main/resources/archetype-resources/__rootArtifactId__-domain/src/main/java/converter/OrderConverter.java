#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.converter;

import ${package}.model.Order;
import ${package}.gateway.database.po.OrderInfoPO;
import ${package}.gateway.database.po.OrderItemPO;
import ${package}.util.BeanConvertUtils;

import java.util.Date;
import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 16:15
 */
public class OrderConverter {

    public static OrderInfoPO toDataObject(Order order){
        OrderInfoPO orderPO = new OrderInfoPO();
        orderPO.setCreateTime(new Date());
        orderPO.setOrderSn(order.getOrderSn());
        orderPO.setTotalPrice(order.getTotalPrice());
        return orderPO;
    }
    public static List<OrderItemPO> toItemDataObject(Order order){
        return BeanConvertUtils.convertListTo(order.getOrderItems(), OrderItemPO::new, null);
    }

}
