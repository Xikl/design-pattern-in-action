package com.ximo.designpattern.structural.flyweight;

import java.util.stream.Stream;

/**
 * @author xikl
 * @date 2019/4/12
 */
public class Test {

    /**
     * Returns a {@code double} value with a positive sign, greater
     *      * than or equal to {@code 0.0} and less than {@code 1.0}.
     *      * Returned values are chosen pseudorandomly with (approximately)
     * Math.random() 0.0<=  a < 1.0
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String[] departArr = Stream.of("RD", "PM", "QA", "BD").toArray(String[]::new);

            int index = (int) (Math.random() * departArr.length);
            System.out.println(index);
            String depart = departArr[index];
            System.out.println(index);
            System.out.println(depart);

            Employee manager = EmployeeFactory.getManager(depart);
            System.out.println(manager);
        }


    }


}
