package com.pattern.design.builder;

/**
 * @Description 具体建造类
 * @Author yuki
 * @Date 2019/4/10 9:31
 * @Version 1.0
 **/
public class SmartHumanBuilder implements IHumanBuilder {
    private Human human=new Human();
    @Override
    public void buildHead() {
        human.setHead("高智商头脑");
    }
    @Override
    public void buildBody() {
        human.setBody("新的身体");
    }
    @Override
    public void buildHand() {
        human.setHand("新的手");
    }
    @Override
    public void buildFoot() {
        human.setFoot("新的脚");
    }
    @Override
    public Human createHuman() {
        return human;
    }
}
