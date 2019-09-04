package com.pattern.design.facade;

/**
 * @Description 门面类
 * tips:属性初始化只有一次，构造器初始化调用时就会执行一次
 * @Author yuki
 * @Date 2019/4/18 17:11
 * @Version 1.0
 **/
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;
    Computer(){
        cpu=new CPU();
        disk=new Disk();
        memory=new Memory();
    }
    public void start(){
        cpu.start();
        disk.start();
        memory.start();
    }
    public void shutDown(){
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
    }
}
