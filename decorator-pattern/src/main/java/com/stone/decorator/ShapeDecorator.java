package com.stone.decorator;

import com.stone.entity.Shape;

/**
 * @author Jeff
 * <p>
 * 形状装饰器，创建实现了 Shape 接口的抽象装饰类
 */
public abstract class ShapeDecorator implements Shape {

    /**
     * 受装饰的形状
     */
    protected Shape decoratedShape;

    /**
     * 构造，转递装饰形状
     *
     * @param decoratedShape 装饰形状
     */
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /**
     * 画受装饰的形状
     */
    public void draw() {
        decoratedShape.draw();
    }
}