package com.ximo.designpattern.creational.prototype;

import java.text.MessageFormat;

/**
 * 假设邮件的创建
 * 原型模式 需要实现clone方法
 * 深度拷贝 和 浅拷贝
 *
 * @author xikl
 * @date 2019/4/1
 */
public class MailInfo implements Cloneable{

    private String name;

    private String address;

    private String content;

    public MailInfo() {
        System.out.println("created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void sendMail(MailInfo mailInfo) {
        String outputContent = "你好，{0}， 给你发送了一份地址为{1}， 邮件内容为：{2}";
        System.out.println(MessageFormat.format(outputContent, mailInfo.getName(), mailInfo.getAddress(),
                mailInfo.getContent()));
    }

    public static void saveOriginMailRecord(MailInfo mailInfo) {
        System.out.println("原始邮件内容为：" + mailInfo.getContent());
    }


    @Override
    public String toString() {
        return "MailInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("克隆对象");
        return super.clone();
    }
}
