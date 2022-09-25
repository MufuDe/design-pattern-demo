package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 真实图片
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     * 实现展示图片方法
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    /**
     * 模拟从硬盘加载图片
     *
     * @param fileName 文件名
     */
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}