package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 代理图片对象
 */
public class ProxyImage implements Image {

    /**
     * 包含真实图片对象属性
     */
    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}