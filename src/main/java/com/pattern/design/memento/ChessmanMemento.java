package com.pattern.design.memento;

/**
 * @Description 备忘录：象棋备忘录
 * 结构与原发器一样
 * @Author yuki
 * @Date 2019/4/24 9:38
 * @Version 1.0
 **/
public class ChessmanMemento {
    public String Label;
    public int X;
    public int Y;
    public ChessmanMemento(String label, int x, int y) {
        Label = label;
        X = x;
        Y = y;
    }
}
