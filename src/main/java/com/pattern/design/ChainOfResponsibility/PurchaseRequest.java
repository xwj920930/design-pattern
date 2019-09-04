package com.pattern.design.ChainOfResponsibility;

/**
 * @Description 采购请求
 * @Author yuki
 * @Date 2019/4/22 9:34
 * @Version 1.0
 **/
public class PurchaseRequest {
    //采购金额
    public double amount;
    //采购订单号
    public String number;
    //采购目的
    public String purpose;
    public PurchaseRequest(double amount, String number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }
}
