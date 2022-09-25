package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 绿圈
 */
public class GreenCircle implements DrawAPI {

    /**
     * 绿圆画圆
     *
     * @param radius 半径
     * @param x      x坐标
     * @param y      y坐标
     */
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}