package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 包装纸，创建实现 Packing 接口的实体类
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
