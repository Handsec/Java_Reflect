package com.reflect.myreflect2;

public class Student {
    // 学生类
    private String name;
    private int age;

    // 构造方法
    public Student() {
    }

    // 有参构造方法   公共
    public Student(String name) {
        this.name = name;
    }

    // 有参构造方法   受保护
    protected Student(int age) {
        this.age = age;
    }

    // 有参构造方法   私有
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
