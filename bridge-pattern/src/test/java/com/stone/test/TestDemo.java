package com.stone.test;

import com.stone.entity.GreenCircle;
import com.stone.entity.RedCircle;
import com.stone.entity.Circle;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();

        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
        greenCircle.draw();
    }
}
