package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 创建实现了 Shape 抽象类的实体类
 */
public class Circle extends Shape {

    private int x;

    private int y;

    private int radius;

    /**
     * 构造，传入指定API则创建指定类
     *
     * @param x       x坐标
     * @param y       y坐标
     * @param radius  半径
     * @param drawAPI 画API
     */
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
