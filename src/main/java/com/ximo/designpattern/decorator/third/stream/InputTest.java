package com.ximo.designpattern.decorator.third.stream;

import java.io.*;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                new FileInputStream("D:\\App\\IDEA\\workspace\\sutdy\\design-pattern-in-action\\src\\main\\resources\\test.txt")))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
