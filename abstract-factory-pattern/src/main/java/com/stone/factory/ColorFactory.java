package com.stone.factory;

import com.stone.entity.*;

/**
 * @author Jeff
 * <p>
 * 颜色工厂——继承抽象工厂
 */
public class ColorFactory extends AbstractFactory {

    /**
     * 获取颜色产品
     *
     * @param color 颜色
     * @return 颜色产品
     */
    @Override
    public Color getColor(String color) {
        final String COLOR_BLUE = "BLUE";
        final String COLOR_GREEN = "GREEN";
        final String COLOR_RED = "RED";

        if (color == null) {
            return null;
        }
        switch (color) {
            case COLOR_BLUE:
                return new Blue();
            case COLOR_GREEN:
                return new Green();
            case COLOR_RED:
                return new Red();
            default:
                return null;
        }
    }

    /**
     * 获取形状产品
     *
     * @param shape 形状
     * @return 形状产品
     */
    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
