package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Pu Xiao
 * @date 2024/3/26
 */
@Mapper
public interface OrderMapper {
    void insert(Orders order);
}
