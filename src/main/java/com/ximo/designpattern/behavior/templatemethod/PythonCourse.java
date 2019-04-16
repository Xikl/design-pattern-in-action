package com.ximo.designpattern.behavior.templatemethod;

/**
 * @author xikl
 * @date 2019/4/16
 */
public class PythonCourse extends AbstartCourse {

    private boolean needWriteArticle;

    public PythonCourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    public PythonCourse() {
    }

    public void setNeedWriteArticle(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("python 真的牛逼！");
        System.out.println("python code");
        System.out.println("panda");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticle;
    }
}
