package com.stone.maker;

import com.stone.entity.Circle;
import com.stone.entity.Rectangle;
import com.stone.entity.Shape;
import com.stone.entity.Square;

/**
 * @author Jeff
 * <p>
 * 形状制造，外观类
 */
public class ShapeMaker {

    private Shape circle;

    private Shape rectangle;

    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}