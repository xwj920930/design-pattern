package com.pattern.design.mediator;

/**
 * @Description
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //中介
        MediatorStructure mediator=new MediatorStructure();
        //同事
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);
        //中介注册人员
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        //发送消息，消息经过中介自动转发
        tenant.constact("听说你那里有房");
        houseOwner.constact("是的，你要吗");
    }
}
