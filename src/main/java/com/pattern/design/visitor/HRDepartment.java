package com.pattern.design.visitor;

/**
 * @Description 具体访问者：人力资源部
 * @Author yuki
 * @Date 2019/4/23 10:38
 * @Version 1.0
 **/
public class HRDepartment extends Department {
    //人力资源部对全职员工操作
    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        System.out.println("人力资源部对全职员工"+fullTimeEmployee.getName()+"操作");
    }
    //人力资源部对兼职员工操作
    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        System.out.println("人力资源部对兼职员工"+partTimeEmployee.getName()+"操作");
    }
}
