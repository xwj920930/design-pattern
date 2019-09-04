package com.pattern.design.memento;

/**
 * @Description 测试单备忘录
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MementoCaretaker caretaker=new MementoCaretaker();
        Chessman chessman=new Chessman("车",1,1);
        display(chessman);
        //保存状态
        System.out.println("保存状态");
        caretaker.memento=chessman.save();
        chessman.Y=4;
        display(chessman);
        //保存状态
        System.out.println("保存状态");
        caretaker.memento=chessman.save();
        chessman.X=5;
        display(chessman);
        System.out.println("撤销");
        chessman.restore(caretaker.memento);
        display(chessman);
    }
    private static void display(Chessman chessman){
        System.out.println("棋子："+chessman.Label+";当前位置："+chessman.X+","+chessman.Y);
    }
}
