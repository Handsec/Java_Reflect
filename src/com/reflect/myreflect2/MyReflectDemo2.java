package com.reflect.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
        *  1.class类中用于获取构造方法的方法
        *          Constructor<?>[] getconstructors()
        *          Constructor<?>[] getDeclaredconstructors()
        *          Constructor<T> getConstructor(class<?>... parameterTypes)
        *          Constructor<T> getDeclaredconstructor(class<?>... parameterTypes)
        *  2.Constructor类中用于创建对象的方法
        *           T newInstance(object... initargs)
        *           setAccessible(boolean flag)
        *
        */

        //1.获取class字节码文件对象
        Class clazz = Class.forName("com.reflect.myreflect2.Student");
        System.out.println("获取的字节码文件对象：" + clazz);

        //2.获取构造方法 getConstructors 和 getDeclaredConstructors 获取的构造方法不同
        //获取所有公共构造方法
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor con : cons1) {
            System.out.println("公共构造方法：" + con);
        }
        //获取所有构造方法（包括私有、受保护、默认、公共）getDeclaredConstructors
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println("所有构造方法（包括私有、受保护、默认、公共）：" + con);
        }
        //获取指定参数类型的公共构造方法 getDeclaredConstructor 注意区分，没有s 不加参数类型时，获取的是无参构造方法
        Constructor con1 = clazz.getDeclaredConstructor();
        System.out.println("指定参数类型的公共构造方法：" + con1);

        //获取指定参数类型的构造方法 公共 （包括私有、受保护、默认、公共）
        Constructor con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println("指定参数类型的构造方法（包括私有、受保护、默认、公共）：" + con2);
        //获取指定参数类型的构造方法 受保护（包括私有、受保护、默认、公共）
        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println("指定参数类型的构造方法（包括私有、受保护、默认、公共）：" + con3);

        //获取两个参数的构造方法 私有（包括私有、受保护、默认、公共）
        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
        int modifiers = con4.getModifiers(); //获取构造方法的修饰符
        System.out.println("构造方法的修饰符：" + modifiers); //输出：构造方法的修饰符：2
        //注意：如果是私有的构造方法，需要设置可访问
        System.out.println("两个参数的构造方法（包括私有、受保护、默认、公共）：" + con4);

        //获取构造方法的参数类型
        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("构造方法的参数类型：" + parameter);
        }
        //3.创建对象
        //使用无参构造方法创建对象
        con4.setAccessible(true); //暴力反射 临时取消权限校验私有的构造方法需要设置可访问 当前构造方法是私有的
        Student stu = (Student) con4.newInstance("张三", 18);
        System.out.println("使用私有构造方法创建的对象：" + stu);
        //使用有参构造方法创建对象
        Constructor con5 = clazz.getDeclaredConstructor(String.class, int.class);
        con5.setAccessible(true); //暴力反射 临时取消权限校验私有的构造方法需要设置可访问
        Student stu2 = (Student) con5.newInstance("李四", 20);
        System.out.println("使用有参构造方法创建的对象：" + stu2);

    }
}
