package com.pattern.design.command;

/**
 * @Description 具体命令：一串命令集合
 * @Author yuki
 * @Date 2019/4/23 16:50
 * @Version 1.0
 **/
public class QuickCommand implements Command{
    private Command[] commands;
    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
//命令队列写法
//class CommandQueue {
//    //定义一个ArrayList来存储命令队列
//    private ArrayList<Command> commands = new ArrayList<Command>();
//    public void addCommand(Command command) {
//        commands.add(command);
//    }
//    public void removeCommand(Command command) {
//        commands.remove(command);
//    }
//    //循环调用每一个命令对象的execute()方法
//    public void execute() {
//        for (Object command : commands) {
//            ((Command)command).execute();
//        }
//    }
//}
