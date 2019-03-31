package com.ximo.designpattern.creational.singleton.hacker;

import com.ximo.designpattern.creational.singleton.innerholder.SingletonWithHolder;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式的破坏者
 *
 * @author xikl
 * @date 2019/3/28
 */
public class Hacker {


    public static void main(String[] args) throws Exception {
//        hackByObjectOutputStream();
//        hackByReflect();

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


}
