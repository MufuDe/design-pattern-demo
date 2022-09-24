package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 红色
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
