package com.ximo.designpattern.behavior.observer.guavaeventbus.v2;

/**
 * @author xikl
 * @date 2019/4/22
 */
public class Question {

    private String userName;

    private String content;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
