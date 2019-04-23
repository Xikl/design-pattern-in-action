package com.ximo.designpattern.behavior.observer.guavaeventbus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @author xikl
 * @date 2019/4/23
 */
public class SimpleTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        SomeEvent someEvent = new SomeEvent();

        eventBus.register(someEvent);
        eventBus.post("你好 eventbus");
        SomeEvent2 someEvent2 = new SomeEvent2();

        eventBus.register(someEvent2);
        eventBus.post("another message");


    }


    static class SomeEvent {

        @Subscribe
        public void subscribe(String string) {
            System.out.println("接收到了其他的地方的数据（by 观察者模式 guava event bus）");
            System.out.println("data：" + string);
        }
    }

    static class SomeEvent2 {
        @Subscribe
        public void subsvribe(String string) {
            System.out.println("接收到了一个新的值");
            System.out.println("data: " + string.length() + ": " + string);
        }

    }


}

