package com.pattern.design.proxy;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
//        ISearcher searcher=new ProxySearcher();
//        searcher.doSearch("xwj");
        //动态代理
        ISearcher searcher=new MyDynamicProxy(new RealSearcher()).getProxy();
        searcher.doSearch("abc");
    }
}
