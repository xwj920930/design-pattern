package com.pattern.design.factoryMethod;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/4 10:07
 * @Version 1.0
 **/
public class DatabaseLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
