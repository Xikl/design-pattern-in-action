package com.ximo.designpattern.creational.singleton.hacker;

import com.ximo.designpattern.creational.singleton.enums.SingletonWithEnum;
import com.ximo.designpattern.creational.singleton.hungrysingleton.SingletonWithHungry;
import com.ximo.designpattern.creational.singleton.innerholder.SingletonWithHolder;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 单例模式的破坏者
 * 假设用原型模式进行破坏单例，那么不实现cloneable 或者 实现 且 clone方法放回instance就行
 *
 * @author xikl
 * @date 2019/3/28
 */
public class Hacker {


    public static void main(String[] args) throws Exception {
//        hackByObjectOutputStream();
//        hackByReflect();
        testEnumsSingleton();

    }


    private static void hackByObjectOutputStream() throws IOException, ClassNotFoundException {
        String fileName = "oos_instance.txt";
        SingletonWithHolder instance = SingletonWithHolder.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        oos.writeObject(instance);

        File file = new File(fileName);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonWithHolder singletonWithHolder = (SingletonWithHolder) ois.readObject();
        System.out.println(singletonWithHolder);
        System.out.println(instance);
        System.out.println(instance == singletonWithHolder);
    }

    private static void hackByReflect() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Constructor con = SingletonWithHolder.class.getDeclaredConstructor();
        con.setAccessible(true);
        SingletonWithHolder newInstance = (SingletonWithHolder) con.newInstance();

        SingletonWithHolder instance = SingletonWithHolder.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
    }

    /**
     * 反射会报错 无参数构造器
     *
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @see Enum 只有一个构造器 且是 有参的
     * <p>
     * Exception in thread "main" java.lang.NoSuchMethodException: com.ximo.designpattern.creational.singleton.enums.SingletonWithEnum.<init>()
     * at java.lang.Class.getConstructor0(Class.java:3082)
     * at java.lang.Class.getDeclaredConstructor(Class.java:2178)
     * at com.ximo.designpattern.creational.singleton.hacker.Hacker.getInstanceByReflect(Hacker.java:63)
     * at com.ximo.designpattern.creational.singleton.hacker.Hacker.testEnumsSingleton(Hacker.java:54)
     * at com.ximo.designpattern.creational.singleton.hacker.Hacker.main(Hacker.java:22)
     * <p>
     * -- 第二种的时候 报错
     * Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
     * at java.lang.reflect.Constructor.newInstance(Constructor.java:417)
     * at com.ximo.designpattern.creational.singleton.hacker.Hacker.testEnumsSingleton(Hacker.java:73)
     * at com.ximo.designpattern.creational.singleton.hacker.Hacker.main(Hacker.java:22)
     */
    private static void testEnumsSingleton() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SingletonWithEnum instance = SingletonWithEnum.getInstance();
        Constructor con = SingletonWithEnum.class.getDeclaredConstructor(String.class, int.class);
        con.setAccessible(true);
        SingletonWithEnum instanceByReflect = (SingletonWithEnum) con.newInstance("name", 222);

        System.out.println(instance);
        System.out.println(instanceByReflect);
        System.out.println(instance == instanceByReflect);


    }


    /**
     * 很牛逼
     * 要不重写 要么就返回instance
     *
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private static void hackByPrototype() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SingletonWithHungry singletonWithHungry = SingletonWithHungry.getInstance();
        Method method = SingletonWithHungry.class.getDeclaredMethod("clone");
        method.setAccessible(true);

        SingletonWithHungry singletonWithHungry1 = (SingletonWithHungry) method.invoke(singletonWithHungry);
        System.out.println(singletonWithHungry);
        System.out.println(singletonWithHungry1);

    }


}
