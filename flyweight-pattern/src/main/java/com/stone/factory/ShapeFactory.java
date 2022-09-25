package com.stone.factory;

import com.stone.entity.Circle;
import com.stone.entity.Shape;

import java.util.HashMap;

/**
 * @author Jeff
 * <p>
 * 形状工厂
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    /**
     * 通过颜色获取对应的对象
     *
     * @param color 颜色
     * @return 形状对象
     */
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}