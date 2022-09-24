package com.stone.producer;

import com.stone.factory.AbstractFactory;
import com.stone.factory.ColorFactory;
import com.stone.factory.ShapeFactory;

/**
 * @author Jeff
 * <p>
 * 一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 */
public class FactoryProducer {

    /**
     * 通过传递选择（颜色|形状）获取相应工厂
     *
     * @param choice 颜色|形状
     * @return 工厂
     */
    public static AbstractFactory getFactory(String choice) {
        final String SHAPE_FACTORY = "SHAPE";
        final String COLOR_FACTORY = "COLOR";

        switch (choice) {
            case SHAPE_FACTORY:
                return new ShapeFactory();
            case COLOR_FACTORY:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
