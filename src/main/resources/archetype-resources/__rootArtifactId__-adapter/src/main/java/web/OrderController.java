#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import ${package}.command.OrderAddCmd;
import ${package}.query.OrderListQry;
import ${package}.service.OrderAppService;
import ${package}.vo.OrderVO;
import com.dsy.sunshine.core.Response;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:21
 */
@RestController
public class OrderController {

    @Autowired
    private OrderAppService orderAppService;

    @PostMapping("addOrder")
    public Response addOrder(@RequestBody @Valid OrderAddCmd cmd){
        orderAppService.addOrder(cmd);
        return Response.buildSuccess();
    }

    @GetMapping("listOrder")
    public ResponseWithData<List<OrderVO>> listOrder(@Valid OrderListQry qry){
        return orderAppService.listOrder(qry);
    }

}
