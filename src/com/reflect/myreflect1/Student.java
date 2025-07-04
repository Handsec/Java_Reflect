package com.reflect.myreflect1;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参构造方法");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法");
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
     * 显示学生信息
     */
    @Override
    public String toString() {
        return  "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
