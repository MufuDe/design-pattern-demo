package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 项目类接口，相对于包装类接口
 * @see Packing 包装类接口
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
