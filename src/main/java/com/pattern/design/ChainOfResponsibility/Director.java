package com.pattern.design.ChainOfResponsibility;

/**
 * @Description 具体处理类：主管
 * @Author yuki
 * @Date 2019/4/22 9:44
 * @Version 1.0
 **/
public class Director extends Approver{
    public Director(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.amount<50000){
            //处理请求
            System.out.printf("主管%s审批采购单：%s金额：%.2f元，采购目的：%s",name,purchaseRequest.number,purchaseRequest.amount,purchaseRequest.purpose);
            System.out.println();
        }else {
            //处理不了，转给上级
            successor.processRequest(purchaseRequest);
        }
    }
}
