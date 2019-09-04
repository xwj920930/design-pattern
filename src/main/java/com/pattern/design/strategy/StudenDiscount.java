package com.pattern.design.strategy;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:05
 * @Version 1.0
 **/
public class StudenDiscount implements Discount {
    @Override
    public double caculate(double price) {
        return price*0.8;
    }
}
