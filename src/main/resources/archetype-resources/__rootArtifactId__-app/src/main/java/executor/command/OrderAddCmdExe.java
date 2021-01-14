#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.executor.command;


import ${package}.command.OrderAddCmd;
import ${package}.converter.OrderConverter;
import ${package}.ability.OrderDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:58
 */
@Component
public class OrderAddCmdExe {

    @Autowired
    private OrderDomainService orderDomainService;

    public void executor(OrderAddCmd cmd){
         orderDomainService.addOrder(OrderConverter.toEntity(cmd));
    }

}
