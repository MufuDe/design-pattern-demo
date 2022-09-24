package com.stone.factory;

import com.stone.entity.*;

/**
 * @author Jeff
 * <p>
 * 形状工厂——继承抽象工厂
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * 获取颜色产品
     *
     * @param color 颜色
     * @return 颜色产品
     */
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 获取形状产品
     *
     * @param shape 形状
     * @return 形状产品
     */
    @Override
    public Shape getShape(String shape) {
        final String SHAPE_CIRCLE = "CIRCLE";
        final String SHAPE_RECTANGLE = "RECTANGLE";
        final String SHAPE_SQUARE = "SQUARE";

        if (shape == null) {
            return null;
        }
        switch (shape) {
            case SHAPE_CIRCLE:
                return new Circle();
            case SHAPE_RECTANGLE:
                return new Rectangle();
            case SHAPE_SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
