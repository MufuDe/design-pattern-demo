package com.stone.test;

import com.stone.entity.Image;
import com.stone.entity.ProxyImage;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test() {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
