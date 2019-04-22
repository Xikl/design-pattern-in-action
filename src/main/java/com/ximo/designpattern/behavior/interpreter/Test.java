package com.ximo.designpattern.behavior.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author xikl
 * @date 2019/4/22
 */
public class Test {


    /**
     * 解释器模式
     * @see java.util.regex.Pattern
     *
     * @param args
     */
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();

        Expression expression = expressionParser.parseExpression("100 * 100");
        Integer value = (Integer) expression.getValue();
        System.out.println(value);

        // 搞定sql解析

    }

}
