package com.pattern.design.facade;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/4 10:12
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.start();
        computer.shutDown();
    }
}
