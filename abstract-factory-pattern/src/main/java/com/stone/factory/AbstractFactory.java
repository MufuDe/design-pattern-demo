package com.stone.factory;

import com.stone.entity.Color;
import com.stone.entity.Shape;

/**
 * @author Jeff
 * <p>
 * 抽象工厂——规范产品族产品创建的方法
 */
public abstract class AbstractFactory {

    /**
     * 获取颜色产品族颜色产品
     *
     * @param color 颜色
     * @return 颜色产品
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状产品族形状产品
     *
     * @param shape 形状
     * @return 形状产品
     */
    public abstract Shape getShape(String shape);
}
