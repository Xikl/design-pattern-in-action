package com.ximo.designpattern.structural.decorator.first;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 朱文赵
 * @date 2018/3/20 12:02
 * @description
 */
@Getter
@Setter
public class Decorator extends BaseComponent {

    protected BaseComponent component;

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
