package org.example;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectdome1 {

    public static void getstudentnews() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //拿到类的字节码的三种方式 只要拿到字节码 是，都好办
        //通过路径
        Class<?> Class1 = Class.forName("org.example.Student");
        //通过类名
        Class<Student> Class2 = Student.class;
        //通过对象
        Student stu = new Student();
        Class<? extends Student> Class3 = stu.getClass();

        //通过字节码来拿到类的构造器
        Constructor<?>[] constructors = Class1.getConstructors();

        for (Constructor<?> constructor : constructors) {
            Object o = constructor.newInstance();
            String string = o.toString();
            System.out.println(string);
        }
        System.out.println("-------------");
        System.out.println(constructors);
        System.out.println(constructors.length);


    }




}
