package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 绿色
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
