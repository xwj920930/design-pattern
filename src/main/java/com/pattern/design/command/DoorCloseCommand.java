package com.pattern.design.command;

/**
 * @Description 具体命令：关门
 * @Author yuki
 * @Date 2019/4/23 16:50
 * @Version 1.0
 **/
public class DoorCloseCommand implements Command{
    private Door door;
    public DoorCloseCommand(Door door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.close();
    }
}
