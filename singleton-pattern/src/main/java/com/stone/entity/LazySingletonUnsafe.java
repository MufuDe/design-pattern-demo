package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 懒汉式单例，线程不安全版本
 */
public class LazySingletonUnsafe {

    /*
        是否 Lazy 初始化：是
        是否多线程安全：否
        实现难度：易
    */

    private static LazySingletonUnsafe instance;

    private LazySingletonUnsafe() {
    }

    public static LazySingletonUnsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}
