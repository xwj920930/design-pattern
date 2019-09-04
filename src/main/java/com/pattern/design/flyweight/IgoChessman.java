package com.pattern.design.flyweight;

/**
 * @Description 享元抽象类：围棋
 * @Author yuki
 * @Date 2019/4/19 9:13
 * @Version 1.0
 **/
public abstract class IgoChessman {
//    共享抽象方法（颜色）
    public abstract String chessColor();
    public void display(Coordinate coordinate){
        System.out.println("棋子颜色:"+chessColor()+"位置:"+coordinate);
    }
}
