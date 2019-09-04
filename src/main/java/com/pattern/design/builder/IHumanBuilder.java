package com.pattern.design.builder;
//抽象建造者
public interface IHumanBuilder {
    void buildHead();
    void buildBody();
    void buildHand();
    void buildFoot();
    Human createHuman();
}
