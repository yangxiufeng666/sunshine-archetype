#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exception;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 16:26
 */
public class NotEnoughInventoryException extends DomainException{
    public NotEnoughInventoryException(String message) {
        super(message);
    }
}
