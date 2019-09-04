package com.pattern.design.strategy;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:07
 * @Version 1.0
 **/
public class ChildrenDiscount implements Discount{
    @Override
    public double caculate(double price) {
        return price-10;
    }
}
