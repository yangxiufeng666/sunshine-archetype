#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import com.dsy.sunshine.core.ValueObject;
import lombok.Data;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 14:48
 */
@Data
public class Consignee extends ValueObject {
    String name;
    String mobile;
    String province;
    String city;
    String county;
    String detailAddress;
}
