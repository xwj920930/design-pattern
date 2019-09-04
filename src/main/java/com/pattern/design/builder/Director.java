package com.pattern.design.builder;

/**
 * @Description 指挥者
 * @Author yuki
 * @Date 2019/4/10 9:36
 * @Version 1.0
 **/
public class Director {
    public Human createHumanByDirector(IHumanBuilder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildHand();
        builder.buildFoot();
        return builder.createHuman();
    }
}
