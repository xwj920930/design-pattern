package com.pattern.design.command;

/**
 * @Description 调用者：遥控器9键
 * @Author yuki
 * @Date 2019/4/23 16:54
 * @Version 1.0
 **/
public class ControlPanel {
    private static final int CONTROL_SIZE=9;
    private Command[] commands;
    public ControlPanel() {
        commands=new Command[CONTROL_SIZE];
        for (int i=0;i<CONTROL_SIZE;i++) {
            commands[i]=new NoCommand();
        }
    }
    //设置按键
    public void setCommand(int index,Command command){
        commands[index]=command;
    }
    //点击事件，invoke方法
    public void keyPress(int index){
        commands[index].execute();
    }
}
