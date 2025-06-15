/**
 * @author hands
 * @date 2025/6/15 14:57
 */
package com.reflect.myreflect3;

public class Student {
    /**
     * 学生类
     * 包含不同访问权限的构造方法
     * 无参构造方法、一个参数的构造方法、一个参数的受保护构造方法、两个参数的私有构造方法、三个参数的公共构造方法
     */
    private String name;
    private int age;
    public String gender;


    // 无参构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("有一个参数的构造方法：" + name);
    }

    protected Student(int age) {
        this.age = age;
        System.out.println("有一个参数的受保护构造方法：" + age);
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有两个参数的私有构造方法：" + name + ", " + age);
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }
}
