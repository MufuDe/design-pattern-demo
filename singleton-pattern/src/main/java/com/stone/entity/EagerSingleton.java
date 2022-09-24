package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 饿汉式
 */
public class EagerSingleton {

    /*
        是否 Lazy 初始化：否
        是否多线程安全：是
        实现难度：易
    */

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {

        /*
            优点：没有加锁，执行效率会提高。
            缺点：类加载时就初始化，浪费内存。
        */

        return instance;
    }
}
