package com.stone.test;

import com.stone.cache.ShapeCache;
import com.stone.entity.Shape;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        // 模拟从数据库查询数据，并添加至缓存中
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
