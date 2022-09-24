package com.stone.entity;

/**
 * @author Jeff
 *
 * 创建一个实现了 Cloneable 接口的抽象类
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
