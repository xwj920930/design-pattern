package com.pattern.design.adapter;

/**
 * @Description 适配器适配大口和小口
 * @Author yuki
 * @Date 2019/4/11 10:37
 * @Version 1.0
 **/
public class SmallToBig implements BigPort{
    private SmallPort smallPort;
    public SmallToBig(SmallPort smallPort){
        this.smallPort=smallPort;
    }
    @Override
    public void useBigPort() {
        smallPort.useSmallPort();
    }
}
