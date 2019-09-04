package com.pattern.design.mediator;

/**
 * @Description 具体同事：房东
 * @Author yuki
 * @Date 2019/4/26 9:43
 * @Version 1.0
 **/
public class HouseOwner extends Person{
    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    //与中介者联系，将自己的话和自身类型发送给中介
    public void constact(String message){
        mediator.constact(message,this);
    }
    //收到消息
    public void getMessage(String message){
        System.out.println("房东："+name+"，获得消息："+message);
    }
}
