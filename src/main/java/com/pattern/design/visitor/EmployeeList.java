package com.pattern.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 对象结构：员工集合
 * @Author yuki
 * @Date 2019/4/23 10:50
 * @Version 1.0
 **/
public class EmployeeList {
    //存储员工对象
    private List<Employee> employees=new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    //遍历员工列表
    public void accept(Department handler){
        employees.forEach(employee -> employee.accept(handler));
    }
}
