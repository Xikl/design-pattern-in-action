package com.ximo.designpattern.structural.composite;

/**
 * @author xikl
 * @date 2019/4/14
 */
public class Test {

    public static void main(String[] args) {
        BaseCatalogComponent linuxCourse = new Course("linux course", 11);
        BaseCatalogComponent windowCourse = new Course("windows course", 12);

        BaseCatalogComponent javaCourseCatalog = new CourseCatalog("java course catalog", 2);

        BaseCatalogComponent javaCourse1 = new Course("java course1", 13);
        BaseCatalogComponent javaCourse2 = new Course("java course2", 14);
        BaseCatalogComponent javaCourse3 = new Course("java course3", 15);

        javaCourseCatalog.add(javaCourse1);
        javaCourseCatalog.add(javaCourse2);
        javaCourseCatalog.add(javaCourse3);

        BaseCatalogComponent mainCatalog = new CourseCatalog("main catalog", 1);
        mainCatalog.add(javaCourseCatalog);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(windowCourse);

        mainCatalog.print();
    }


}
