package com.pattern.design.proxy;

/**
 * @Description 具体主题
 * @Author yuki
 * @Date 2019/4/18 11:06
 * @Version 1.0
 **/
public class RealSearcher implements ISearcher {
    @Override
    public String doSearch(String userId) {
        System.out.println("查询id为"+userId+"的数据");
        return userId;
    }
}
