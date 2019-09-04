package com.pattern.design.factoryMethod;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/4 10:10
 * @Version 1.0
 **/
public class FileLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        FileLogger fileLogger=new FileLogger();
        return fileLogger;
    }
}
