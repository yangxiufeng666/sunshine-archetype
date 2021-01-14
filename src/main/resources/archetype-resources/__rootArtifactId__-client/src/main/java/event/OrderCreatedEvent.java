#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.event;

import com.dsy.sunshine.core.event.AbstractEvent;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-14
 * @time 9:44
 */
public class OrderCreatedEvent extends AbstractEvent {
    public OrderCreatedEvent(String id) {
        super(id);
    }
}
