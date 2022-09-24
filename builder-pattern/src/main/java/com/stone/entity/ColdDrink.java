package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 冷饮，创建实现 Item 接口的抽象类，该类提供了默认的功能。
 */
public abstract class ColdDrink implements Item {

    /**
     * 提供默认的包装方法
     *
     * @return 瓶
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 规范实现类需要实现的价格方法
     *
     * @return 价格
     */
    @Override
    public abstract float price();
}
