package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @author Pu Xiao
 * @date 2024/3/26
 */
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
