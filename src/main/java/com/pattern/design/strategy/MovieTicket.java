package com.pattern.design.strategy;

/**
 * @Description
（1）学生凭学生证可享受票价8折优惠；
（2）儿童可以享受每张票减免10元的优惠（原始票价需要大于20元）；
（3）影院VIP用户享受票价5折优惠
 * @Author yuki
 * @Date 2019/3/29 15:59
 * @Version 1.0
 **/
public class MovieTicket {
    private double price;
    private Discount discount;
    MovieTicket(double price,Discount discount){
        this.price=price;
        this.discount=discount;
    }
    public double caculate(){
        return discount.caculate(price);
    }
}
