package com.pattern.design.ChainOfResponsibility;

/**
 * @Description 具体处理类：董事会
 * printf格式打印
 * %d     十进制整数
 * %f     十进制浮点数    %m.nf：输出共占m列，其中有n位小数
 * %s     字符串
 * @Author yuki
 * @Date 2019/4/22 9:44
 * @Version 1.0
 **/
public class Congress extends Approver{
    public Congress(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        //处理请求
        System.out.printf("董事会%s审批采购单：%s金额：%.2f元，采购目的：%s",name,purchaseRequest.number,purchaseRequest.amount,purchaseRequest.purpose);
        System.out.println();
    }
}
