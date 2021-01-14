#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.command.OrderAddCmd;
import ${package}.executor.command.OrderAddCmdExe;
import ${package}.executor.query.OrderListQryExe;
import ${package}.query.OrderListQry;
import ${package}.vo.OrderVO;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:39
 */
@Service
public class OrderAppService{

    @Autowired
    private OrderAddCmdExe orderAddCmdExe;
    @Autowired
    private OrderListQryExe orderListQryExe;

    @Transactional
    public void addOrder(OrderAddCmd cmd) {
        orderAddCmdExe.executor(cmd);
    }

    public ResponseWithData<List<OrderVO>> listOrder(OrderListQry qry) {
        return orderListQryExe.executor(qry);
    }
}
