package com.ximo.designpattern.behavior.templatemethod;

/**
 * @author xikl
 * @date 2019/4/16
 */
public abstract class AbstartCourse {

    /**
     * 不想子类重写该方法
     *
     */
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        // 不一样的交给子类
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作 video");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();

}
