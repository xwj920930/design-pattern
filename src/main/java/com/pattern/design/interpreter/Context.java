package com.pattern.design.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 环境类，存储变量的值
 * @Author yuki
 * @Date 2019/4/26 15:18
 * @Version 1.0
 **/
public class Context {
    //存储表达式
    private Map<String,Integer> valueMap= new HashMap<>();
    public void addValue(String key,int value){
        valueMap.put(key,value);
    }
    public int getValue(String key){
        return valueMap.get(key);
    }
    public String getValueMap() {
        return valueMap.toString();
    }
}
