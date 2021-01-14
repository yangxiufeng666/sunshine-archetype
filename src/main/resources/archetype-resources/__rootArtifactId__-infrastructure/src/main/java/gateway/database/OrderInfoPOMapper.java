#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.gateway.database;

import ${package}.gateway.database.po.OrderInfoPO;
import ${package}.query.OrderListQry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfoPO record);

    int insertSelective(OrderInfoPO record);

    OrderInfoPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfoPO record);

    int updateByPrimaryKey(OrderInfoPO record);

    List<OrderInfoPO> listOrder(OrderListQry qry);
}