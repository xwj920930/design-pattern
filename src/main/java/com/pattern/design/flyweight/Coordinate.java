package com.pattern.design.flyweight;

/**
 * @Description 外部类：用于确定位置
 * @Author yuki
 * @Date 2019/4/19 9:40
 * @Version 1.0
 **/
public class Coordinate {
    private int X;
    private int Y;
    Coordinate(int X,int Y){
        this.X=X;
        this.Y=Y;
    }
    @Override
    public String toString() {
        return String.valueOf(X)+","+String.valueOf(Y);
    }
}
