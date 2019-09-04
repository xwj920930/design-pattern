package com.pattern.design.command;

/**
 * @Description 具体命令：关灯
 * @Author yuki
 * @Date 2019/4/23 16:50
 * @Version 1.0
 **/
public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
