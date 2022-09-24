package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 方形
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
