package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 创建一个类，在该类上应用标准
 */
public class Person {

    private String name;

    private String gender;

    /**
     * 婚姻状态
     */
    private String maritalStatus;

    /**
     * 构造，仅提供全参构造，而且后续仅提供Get方法
     *
     * @param name          名字
     * @param gender        性别
     * @param maritalStatus 婚姻状态
     */
    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}