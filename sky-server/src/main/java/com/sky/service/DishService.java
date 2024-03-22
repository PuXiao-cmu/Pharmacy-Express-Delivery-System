package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @author Pu Xiao
 * @date 2024/3/21
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
