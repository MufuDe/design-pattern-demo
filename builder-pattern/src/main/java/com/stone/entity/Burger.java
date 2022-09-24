package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 汉堡，创建实现 Item 接口的抽象类，该类提供了默认的功能。
 */
public abstract class Burger implements Item {

    /**
     * 提供默认的包装方法
     *
     * @return 包装纸类
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 定义必须实现的价格方法
     *
     * @return 价格
     */
    @Override
    public abstract float price();
}
