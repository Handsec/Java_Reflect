package com.reflect.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws Exception{
        /**
         * 获取class对象的三种方式:
         *   1.Class.forName("全类名");
         *   2.类名.class
         *   3.对象.getclass();
         */
        //1.第一种方式 Class.forName
        Class clazz1 = Class.forName("com.reflect.myreflect1.Student");
        System.out.println(clazz1);

        //2.第二种方式 类名.class
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.第三种方式 对象.getClass()
        Student student = new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz3);

        //比较三种方式获取的Class对象是否相同
        System.out.println("clazz1 == clazz2: " + (clazz1 == clazz2));
        System.out.println("clazz1 == clazz3: " + (clazz1 == clazz3));
        System.out.println("clazz2 == clazz3: " + (clazz2 == clazz3));

    }
}
