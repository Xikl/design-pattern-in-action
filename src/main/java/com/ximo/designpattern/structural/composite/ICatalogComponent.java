package com.ximo.designpattern.structural.composite;

/**
 * @author xikl
 * @date 2019/4/14
 */
public interface ICatalogComponent {

    void add(BaseCatalogComponent baseCatalogComponent);

    void remove(BaseCatalogComponent baseCatalogComponent);

    String getName();

    double getPrice();

    void print();


}
