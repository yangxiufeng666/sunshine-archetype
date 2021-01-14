#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import com.dsy.sunshine.core.ValueObject;
import lombok.Data;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 17:23
 */
@Data
public class OrderItem extends ValueObject {
    int goodsId;
    String goodsName;
    int goodsQuantity;
    int goodsPrice;
}
