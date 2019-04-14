package com.ximo.designpattern.structural.composite;

/**
 * 组合模式
 *
 * @author xikl
 * @date 2019/4/14
 */
public abstract class BaseCatalogComponent implements ICatalogComponent{

    @Override
    public void add(BaseCatalogComponent baseCatalogComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(BaseCatalogComponent baseCatalogComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException();
    }
}
