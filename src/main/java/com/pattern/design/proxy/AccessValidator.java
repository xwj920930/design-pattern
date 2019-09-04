package com.pattern.design.proxy;

/**
 * @Description 业务一：身份验证
 * @Author yuki
 * @Date 2019/4/18 11:08
 * @Version 1.0
 **/
public class AccessValidator {
    public boolean validate(String userId){
        if ("xwj".equals(userId)){
            System.out.println("身份验证正确");
            return true;
        }else {
            return false;
        }
    }
}
