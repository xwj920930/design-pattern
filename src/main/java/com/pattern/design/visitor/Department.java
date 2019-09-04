package com.pattern.design.visitor;

/**
 * @Description 抽象访问者：部门
 * @Author yuki
 * @Date 2019/4/23 10:13
 * @Version 1.0
 **/
public abstract class Department {
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FullTimeEmployee fullTimeEmployee);
    public abstract void visit(PartTimeEmployee partTimeEmployee);
}
