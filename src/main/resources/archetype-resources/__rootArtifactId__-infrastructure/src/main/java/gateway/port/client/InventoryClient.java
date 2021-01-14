#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.gateway.port.client;

import com.dsy.sunshine.core.Response;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 15:48
 */
public interface InventoryClient {

    Response check();

}
