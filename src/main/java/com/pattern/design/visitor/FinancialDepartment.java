package com.pattern.design.visitor;

/**
 * @Description 具体访问者：财务部
 * @Author yuki
 * @Date 2019/4/23 10:38
 * @Version 1.0
 **/
public class FinancialDepartment extends Department {
    //财务部对全职员工操作
    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        System.out.println("财务部对全职员工"+fullTimeEmployee.getName()+"操作");
    }
    //财务部对兼职员工操作
    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        System.out.println("财务部对兼职员"+partTimeEmployee.getName()+"工操作");
    }
}
