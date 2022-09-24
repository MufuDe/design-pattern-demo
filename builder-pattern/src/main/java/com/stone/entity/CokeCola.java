package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 可口可乐，创建扩展了 Burger 和 ColdDrink 的实体类。
 */
public class CokeCola extends ColdDrink {
    @Override
    public String name() {
        return "Coke Cola";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
