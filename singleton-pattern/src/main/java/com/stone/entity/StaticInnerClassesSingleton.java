package com.stone.entity;

/**
 * @author Jeff
 *
 * 登记式/静态内部类 static inner classes
 */
public class StaticInnerClassesSingleton {

    /*
        是否 Lazy 初始化：是
        是否多线程安全：是
        实现难度：一般
    */

    private static class SingletonHolder{
        private static final StaticInnerClassesSingleton INSTANCE = new StaticInnerClassesSingleton();
    }

    private StaticInnerClassesSingleton(){}

    public static final StaticInnerClassesSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
