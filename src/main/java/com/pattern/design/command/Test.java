package com.pattern.design.command;

/**
 * @Description 模拟智慧家电的遥控器
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //家电
        Light light=new Light();
        Door door=new Door();
        //控制器
        ControlPanel controlPanel=new ControlPanel();
        //设置按键
        controlPanel.setCommand(0,new LightOnCommand(light));
        controlPanel.setCommand(1,new LightOffCommand(light));
        controlPanel.setCommand(2,new DoorOpenCommand(door));
        controlPanel.setCommand(3,new DoorCloseCommand(door));
        //点击
        controlPanel.keyPress(0);
        controlPanel.keyPress(1);
        controlPanel.keyPress(2);
        controlPanel.keyPress(3);
        controlPanel.keyPress(4);
        QuickCommand quickCommand = new QuickCommand(new Command[] { new DoorCloseCommand(door),new LightOffCommand(light)});
        System.out.println("****点击一键搞定按钮****");
        controlPanel.setCommand(8, quickCommand);
        controlPanel.keyPress(8);
    }
}
