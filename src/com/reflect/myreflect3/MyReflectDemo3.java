/**
 * @author hands
 * @date 2025/6/15 14:56
 */
package com.reflect.myreflect3;
import java.lang.reflect.Field;

public class MyReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         *Class 类中用于获取成员变量的方法
         * *          Field[] getFields() //获取所有公共成员变量
         * *          Field[] getDeclaredFields() //获取所有成员变量（包括私有、受保护、默认、公共）
         * * *          Field getField(String name) //获取指定名称的公共成员变量
         * * *          Field getDeclaredField(String name) //获取指定名称的成员变量（包括私有、受保护、默认、公共）
         * * *  Field 类中用于获取成员变量信息的方法
         * * *          String getName() //获取成员变量名称
         * * *          Class<?> getType() //获取成员变量类型
         * * *          Object get(Object obj) //获取成员变量值
         * * *          void set(Object obj, Object value) //设置成员变量值
         * * * *          void setAccessible(boolean flag) //设置是否可以访问私有成员变量
         * * 1.获取class字节码文件对象
         * *          Class clazz = Class.forName("com.reflect.myreflect3.Student");
         * * 2.获取成员变量
         * *          Field[] fields1 = clazz.getFields(); //获取所有公共成员变量
         * *          Field[] fields2 = clazz.getDeclaredFields(); //获取所有成员变量（包括私有、受保护、默认、公共）
         *
         */
        //1.获取class字节码文件对象
        Class clazz = Class.forName("com.reflect.myreflect3.Student");
        System.out.println("获取的字节码文件对象：" + clazz);
        //2.获取成员变量
        //获取所有公共成员变量
        //注意：getFields()方法只能获取公共成员变量，不能获取私有、受保护、默认成员变量
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println("所有成员变量：" + field);
        }


    }
}
