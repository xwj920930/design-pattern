package com.pattern.design.strategy;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:08
 * @Version 1.0
 **/
public class VIPDiscount implements Discount {
    @Override
    public double caculate(double price) {
        return price*0.5;
    }
}
