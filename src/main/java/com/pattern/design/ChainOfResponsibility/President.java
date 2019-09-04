package com.pattern.design.ChainOfResponsibility;

/**
 * @Description 具体处理类：总裁
 * @Author yuki
 * @Date 2019/4/22 9:44
 * @Version 1.0
 **/
public class President extends Approver{
    public President(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.amount<500000){
            //处理请求
            System.out.printf("总裁%s审批采购单：%s金额：%.2f元，采购目的：%s",name,purchaseRequest.number,purchaseRequest.amount,purchaseRequest.purpose);
            System.out.println();
        }else {
            //处理不了，转给上级
            successor.processRequest(purchaseRequest);
        }
    }
}
