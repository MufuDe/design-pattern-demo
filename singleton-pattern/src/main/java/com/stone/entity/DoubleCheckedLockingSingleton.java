package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class DoubleCheckedLockingSingleton {

    /*
        是否 Lazy 初始化：是
        是否多线程安全：是
        实现难度：较复杂
    */

    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
