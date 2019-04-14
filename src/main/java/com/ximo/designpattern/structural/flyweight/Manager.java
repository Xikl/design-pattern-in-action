package com.ximo.designpattern.structural.flyweight;

/**
 * @author xikl
 * @date 2019/4/12
 */
public class Manager implements Employee {

    private String depart;

    private String reportContent;

    public Manager(String depart) {
        this.depart = depart;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
