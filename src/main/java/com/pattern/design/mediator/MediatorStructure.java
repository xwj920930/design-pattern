package com.pattern.design.mediator;

/**
 * @Description 具体中介：中介机构
 * @Author yuki
 * @Date 2019/4/26 9:50
 * @Version 1.0
 **/
public class MediatorStructure extends Mediator{
    //中介需要知道所有同事
    private HouseOwner houseOwner;
    private Tenant tenant;
    public HouseOwner getHouseOwner() {
        return houseOwner;
    }
    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }
    public Tenant getTenant() {
        return tenant;
    }
    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
    @Override
    public void constact(String message, Person person) {
        //消息转发，来自A的发送给B，来自B的发送给A，其中根据person判断消息来自A还是B
        if (person.getClass()==houseOwner.getClass()){
            tenant.getMessage(message);
        }else {
            houseOwner.getMessage(message);
        }
    }
}
