package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 蓝色
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
