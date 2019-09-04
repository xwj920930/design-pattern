package com.pattern.design.visitor;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:54
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        EmployeeList list=new EmployeeList();
        Employee f1 = new FullTimeEmployee("全1");
        Employee f2 = new FullTimeEmployee("全2");
        Employee f3 = new FullTimeEmployee("全3");
        Employee p1 = new PartTimeEmployee("兼1");
        Employee p2 = new PartTimeEmployee("兼2");
        list.addEmployee(f1);
        list.addEmployee(f2);
        list.addEmployee(f3);
        list.addEmployee(p1);
        list.addEmployee(p2);
        Department department1 = new FinancialDepartment();
        Department department2 = new HRDepartment();
        list.accept(department1);
        list.accept(department2);
    }
}
