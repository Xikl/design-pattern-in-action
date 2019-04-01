package com.ximo.designpattern.creational.prototype;

/**
 * @author xikl
 * @date 2019/4/1
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setContent("初始化模板");
        System.out.println(mailInfo);
        for (int i = 0; i < 10; i++) {
            // 采用克隆的对象进行发送
            MailInfo tempMailInfo = (MailInfo) mailInfo.clone();

            String name = "名字：" + i;
            tempMailInfo.setName(name);
            tempMailInfo.setContent("你好这是一份诈骗邮件");
            tempMailInfo.setAddress(name + "@qq.com");
            MailInfo.sendMail(tempMailInfo);
            System.out.println(tempMailInfo);
        }
        MailInfo.saveOriginMailRecord(mailInfo);
    }

}
