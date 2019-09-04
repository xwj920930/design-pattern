package com.pattern.design.memento;

/**
 * @Description 原发器：象棋
 * @Author yuki
 * @Date 2019/4/24 9:37
 * @Version 1.0
 **/
public class Chessman {
    public String Label;
    public int X;
    public int Y;
    public Chessman(String label, int x, int y) {
        Label = label;
        X = x;
        Y = y;
    }
    //保存状态
    public ChessmanMemento save(){
        //新增一个备忘录存入mementoCaretaker
        return new ChessmanMemento(Label,X,Y);
    }
    //恢复状态
    public void restore(ChessmanMemento memento){
        Label=memento.Label;
        X=memento.X;
        Y=memento.Y;
    }
}
