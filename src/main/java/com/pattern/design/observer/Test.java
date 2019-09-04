package com.pattern.design.observer;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Observerable wechatServer = new WechatServer();
        Observer zhangsan = new User("zhangsan");
        Observer lisi = new User("lisi");
        Observer wangwu = new User("wangwu");
        wechatServer.registerObserver(zhangsan);
        wechatServer.registerObserver(lisi);
        wechatServer.registerObserver(wangwu);
        wechatServer.notifyObserver("PHP是最好的语言");
        wechatServer.removeObserver(wangwu);
        wechatServer.notifyObserver("JAVA是最好的语言");
    }
}
