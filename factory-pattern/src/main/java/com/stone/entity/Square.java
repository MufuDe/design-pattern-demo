package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
