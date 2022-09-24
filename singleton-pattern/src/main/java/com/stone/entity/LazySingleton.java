package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 懒汉式单例，线程安全版本
 */
public class LazySingleton {

    /*
        是否 Lazy 初始化：是
        是否多线程安全：是
        实现难度：易
    */

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {

        /*
            优点：第一次调用才初始化，避免内存浪费。
            缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
        */

        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
