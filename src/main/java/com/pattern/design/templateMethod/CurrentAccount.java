package com.pattern.design.templateMethod;

/**
 * @Description 具体子类：活期
 * @Author yuki
 * @Date 2019/4/22 11:12
 * @Version 1.0
 **/
public class CurrentAccount extends Account{
    @Override
    public void caculateInterest() {
        System.out.println("活期计算利率");
    }
    //重写父类的模板
    @Override
    protected void display() {
        System.out.println("显示活期利息");
    }
}
