package com.stone.factory;

import com.stone.entity.Circle;
import com.stone.entity.Rectangle;
import com.stone.entity.Shape;
import com.stone.entity.Square;

/**
 * @author Jeff
 * <p>
 * 形状工厂：通过提供接口名称，获取对应的产品
 */
public class ShapeFactory {

    private static final String SHAPE_CIRCLE = "CIRCLE";
    private static final String SHAPE_RECTANGLE = "RECTANGLE";
    private static final String SHAPE_SQUARE = "SQUARE";

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
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
