package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 创建桥接实现接口
 */
public interface DrawAPI {

    /**
     * 画圆的API
     *
     * @param radius 半径
     * @param x      x坐标
     * @param y      y坐标
     */
    public void drawCircle(int radius, int x, int y);
}
