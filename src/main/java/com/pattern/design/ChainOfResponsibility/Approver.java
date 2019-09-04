package com.pattern.design.ChainOfResponsibility;

/**
 * @Description 抽象处理类：审批
 * @Author yuki
 * @Date 2019/4/22 9:37
 * @Version 1.0
 **/
public abstract class Approver {
    //后继对象
    protected Approver successor;
    //审批人姓名
    protected String name;
    public Approver(String name) {
        this.name = name;
    }
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
