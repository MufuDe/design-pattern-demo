package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 矩形
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}