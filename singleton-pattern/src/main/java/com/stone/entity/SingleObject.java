package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 单例对象
 */
public class SingleObject {
    /**
     * 创建 SingleObject 的一个对象
     */
    private static final SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject() {
    }

    /**
     * 获取唯一可用的对象
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * 显示消息
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
