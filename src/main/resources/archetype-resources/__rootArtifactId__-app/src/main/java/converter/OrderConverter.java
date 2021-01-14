#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.converter;

import ${package}.command.OrderAddCmd;
import ${package}.model.Consignee;
import ${package}.model.Order;
import ${package}.model.OrderItem;
import ${package}.util.BeanConvertUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.UUID;


/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 15:30
 */
public class OrderConverter {

    public static Order toEntity(OrderAddCmd cmd){
        Consignee consignee = new Consignee();
        BeanUtils.copyProperties(cmd.getConsignee() , consignee);
        List<OrderItem> orderItems = BeanConvertUtils.convertListTo(cmd.getGoods(), OrderItem::new, (s, t) -> {});
        return new Order(UUID.randomUUID().toString(), orderItems , consignee);
    }

}
