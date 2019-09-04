package com.pattern.design.adapter;

/**
 * @Description 在实现内部强行转换
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        SmallPort smallPort=new SmallPortImpl();
        BigPort bigPort=new SmallToBig(smallPort);
        bigPort.useBigPort();
    }
}
