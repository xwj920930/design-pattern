package com.pattern.design.visitor;

/**
 * @Description 抽象元素：员工
 * handler:处理者
 * @Author yuki
 * @Date 2019/4/23 10:01
 * @Version 1.0
 **/
public interface Employee {
    //接受一个抽象访问者
    void accept(Department handler);
}
