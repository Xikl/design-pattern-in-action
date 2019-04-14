package com.ximo.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author xikl
 * @date 2019/4/14
 */
public class CourseCatalog extends BaseCatalogComponent{

    private List<BaseCatalogComponent> items = new ArrayList<>();

    /** 目录名称 */
    private String name;

    /** 目录级别 */
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(BaseCatalogComponent baseCatalogComponent) {
        items.add(baseCatalogComponent);
    }

    @Override
    public void remove(BaseCatalogComponent baseCatalogComponent) {
        items.remove(baseCatalogComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (BaseCatalogComponent item : items) {
            Optional.ofNullable(this.level).ifPresent(curLevel -> {
                for (int i = 0; i < curLevel; i++) {
                    System.out.print("  ");
                }
            });
            item.print();
        }
    }
}
