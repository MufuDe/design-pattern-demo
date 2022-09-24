package com.stone.test;

import com.stone.entity.Shape;
import com.stone.factory.ShapeFactory;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
