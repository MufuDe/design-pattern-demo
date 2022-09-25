package com.stone.test;

import com.stone.maker.ShapeMaker;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
