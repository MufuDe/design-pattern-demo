package com.stone.decorator;

import com.stone.entity.Shape;

/**
 * @author Jeff
 * <p>
 * 创建扩展了 ShapeDecorator 类的实体装饰类
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        // 在draw方法中拓展，添加其余（装饰）方法
        setRedBorder(decoratedShape);
    }

    /**
     * 拓展装饰器类方法
     *
     * @param decoratedShape 装饰形状
     */
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}