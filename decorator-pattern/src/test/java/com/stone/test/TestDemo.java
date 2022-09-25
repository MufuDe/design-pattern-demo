package com.stone.test;

import com.stone.decorator.RedShapeDecorator;
import com.stone.decorator.ShapeDecorator;
import com.stone.entity.Circle;
import com.stone.entity.Rectangle;
import com.stone.entity.Shape;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
