# Java反射

[TOC]

## 一、反射的定义

可以从类里面拿东西，成员变量，成员方法和构造方法

![image-20250613132756058](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613132756058.png)

![image-20250613132910393](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613132910393.png)

### (一) 获取

#### 1.获取class对象的三种方式

##### ![image-20250613133358998](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613133358998.png)



## 测试学生类

这个类是一个典型的Java实体类，封装了学生的基本信息，支持通过构造方法创建对象，通过getter/setter访问和修改属性，并能以字符串形式（toString）输出学生信息。

```java
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

```

##### 	（1）Class.forName("全类名");

![image-20250615095610885](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250615095610885.png)

##### 	（2）类名.class

![image-20250615095710490](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250615095710490.png)

##### 	（3）对象.getClass();

![image-20250615095813278](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250615095813278.png)

##### （4）比较三种方式获取的Class对象是否相同

可以看到，通过这三种方式获得的class对象是相同的

![image-20250615100137222](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250615100137222.png)

#### 2.反射获取构造方法

![image-20250613144141847](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613144141847.png)

![image-20250613144508429](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613144508429.png)



##### （1）reflect.Modiffier数字对应的关系

![image-20250613150441118](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613150441118.png)



![image-20250613151812380](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613151812380.png)

##### （2）reflect.Modifier 中 

![image-20250613160847734](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613160847734.png)

![image-20250613160939093](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613160939093.png)

##### （3）私有的构造方法需要设置可访问

![image-20250613163732494](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613163732494.png)

不设置的情况会出现报错

![image-20250613163815008](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613163815008.png)

```java
//暴力反射 临时取消权限校验私有的构造方法需要设置可访问 当前构造方法是私有的
con4.setAccessible(true); 
```

![image-20250613164032013](C:\Users\26687\AppData\Roaming\Typora\typora-user-images\image-20250613164032013.png)



### 解剖



