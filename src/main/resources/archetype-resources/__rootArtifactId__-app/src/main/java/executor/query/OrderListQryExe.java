#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.executor.query;

import ${package}.gateway.database.OrderInfoPOMapper;
import ${package}.gateway.database.po.OrderInfoPO;
import ${package}.query.OrderListQry;
import ${package}.util.BeanConvertUtils;
import ${package}.vo.OrderVO;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:25
 */
@Component
public class OrderListQryExe {

    @Autowired
    private OrderInfoPOMapper orderPOMapper;

    public ResponseWithData<List<OrderVO>> executor(OrderListQry qry){

        List<OrderInfoPO> list = orderPOMapper.listOrder(qry);
        //convert to view object
        List<OrderVO> orderVOList = BeanConvertUtils.convertListTo(list , OrderVO::new, ((s, t) -> t.setOrderId(s.getId())));

        return ResponseWithData.buildSuccess().setData(orderVOList);

    }

}
