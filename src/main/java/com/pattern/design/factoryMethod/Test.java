package com.pattern.design.factoryMethod;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/4 10:12
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        FileLoggerFactory fileLoggerFactory = new FileLoggerFactory();
        ILogger logger = fileLoggerFactory.createLogger();
        logger.writeLog();
    }
}
