package com.pattern.design.templateMethod;

/**
 * @Description 具体子类：定期
 * @Author yuki
 * @Date 2019/4/22 11:12
 * @Version 1.0
 **/
public class SavingAccount extends Account{
    @Override
    public void caculateInterest() {
        System.out.println("定期计算利率");
    }
}
