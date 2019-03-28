package com.ximo.designpattern.creational.singleton.hacker;

import com.ximo.designpattern.creational.singleton.innerholder.SingletonWithHolder;

import java.io.*;

/**
 * 单例模式的破坏者
 *
 *
 * @author xikl
 * @date 2019/3/28
 */
public class Hacker {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        hackByObjectOutputStream();
    }


    private static void hackByObjectOutputStream() throws IOException, ClassNotFoundException {
        String fileName = "oos_instance";
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


}
