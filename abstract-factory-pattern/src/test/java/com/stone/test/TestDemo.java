package com.stone.test;

import com.stone.entity.Color;
import com.stone.entity.Shape;
import com.stone.factory.AbstractFactory;
import com.stone.producer.FactoryProducer;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        if (shapeFactory != null) {
            Shape circle = shapeFactory.getShape("CIRCLE");
            circle.draw();

            Shape rectangle = shapeFactory.getShape("RECTANGLE");
            rectangle.draw();

            Shape square = shapeFactory.getShape("SQUARE");
            square.draw();
        }

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        if (colorFactory != null) {
            Color blue = colorFactory.getColor("BLUE");
            blue.fill();

            Color green = colorFactory.getColor("GREEN");
            green.fill();

            Color red = colorFactory.getColor("RED");
            red.fill();
        }
    }
}
