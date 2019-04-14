package com.ximo.designpattern.structural.flyweight;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xikl
 * @date 2019/4/12
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new ConcurrentHashMap<>();

    /**
     * 每一个部门返回的都是一个固定的对象
     *
     * 享元模式 内部状态 不可变  外部状态可变
     *  如： depart 为外部所影响的 而manager中的title是不可变的 私有属性
     * @param depart 部门名称
     * @return
     */
    static Employee getManager(String depart) {
        String finalDepart = Optional.ofNullable(depart)
                .orElseThrow(IllegalArgumentException::new);


//        Employee employee = EMPLOYEE_MAP.get(finalDepart);
//        if (employee == null) {
//            employee = new Manager(depart);
//            EMPLOYEE_MAP.put(depart, employee);
//        }
//        return employee;

        return EMPLOYEE_MAP.computeIfAbsent(finalDepart, key -> new Manager(finalDepart));
    }

}
