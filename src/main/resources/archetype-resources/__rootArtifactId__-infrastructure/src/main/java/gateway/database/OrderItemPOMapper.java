#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.gateway.database;

import ${package}.gateway.database.po.OrderItemPO;

import java.util.List;

public interface OrderItemPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItemPO record);

    int insertSelective(OrderItemPO record);

    OrderItemPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItemPO record);

    int updateByPrimaryKey(OrderItemPO record);

    int insertAll(List<OrderItemPO> itemPOList);
}