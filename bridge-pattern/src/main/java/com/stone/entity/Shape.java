package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 使用 DrawAPI 接口创建抽象类 Shape
 */
public abstract class Shape {

    /**
     * 画圆API接口类
     */
    protected DrawAPI drawAPI;

    /**
     * 构造，传入画圆API接口类
     *
     * @param drawAPI 画圆API接口类
     */
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     * 画
     */
    public abstract void draw();
}
