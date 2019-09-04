package com.pattern.design.ChainOfResponsibility;

/**
 * @Description
 * @Author yuki
 * @Date 2019/4/22 10:06
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Approver zhuguan = new Director("zhuguan");
        Approver zongcai = new President("zongcai");
        Approver dongshi = new Congress("dongshi");
        zhuguan.setSuccessor(zongcai);
        zongcai.setSuccessor(dongshi);
        PurchaseRequest request1=new PurchaseRequest(8000,"A001","购买PC");
        PurchaseRequest request2=new PurchaseRequest(80000,"A002","公司旅游");
        PurchaseRequest request3=new PurchaseRequest(800000,"A003","租用办公楼");
        zhuguan.processRequest(request1);
        zhuguan.processRequest(request2);
        zhuguan.processRequest(request3);
    }
}
