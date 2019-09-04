package com.pattern.design.memento;

/**
 * @Description 测试多备忘录
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test2 {
    private static int index=-1;
    private static NewMementoCaretaker caretaker=new NewMementoCaretaker();
    public static void main(String[] args) {
        Chessman chessman=new Chessman("车",1,1);
        play(chessman);
        chessman.Y=4;
        play(chessman);
        chessman.X=5;
        play(chessman);
        undo(chessman);
        undo(chessman);
        redo(chessman);
        redo(chessman);
    }
    private static void display(Chessman chessman){
        System.out.println("棋子："+chessman.Label+";当前位置："+chessman.X+","+chessman.Y);
    }
    //下棋，下一次保存一个备忘录
    private static void play(Chessman chessman){
        display(chessman);
        System.out.println("保存状态");
        caretaker.setMemento(chessman.save());
        index++;
    }
    //悔棋
    private static void undo(Chessman chessman){
        System.out.println("悔棋");
        chessman.restore(caretaker.getMemento(--index));
        display(chessman);
    }
    //撤销悔棋
    private static void redo(Chessman chessman){
        System.out.println("撤销悔棋");
        chessman.restore(caretaker.getMemento(++index));
        display(chessman);
    }
}
