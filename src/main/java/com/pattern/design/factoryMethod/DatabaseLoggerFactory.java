package com.pattern.design.factoryMethod;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/4 10:10
 * @Version 1.0
 **/
public class DatabaseLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        DatabaseLogger databaseLogger = new DatabaseLogger();
        return databaseLogger;
    }
}
