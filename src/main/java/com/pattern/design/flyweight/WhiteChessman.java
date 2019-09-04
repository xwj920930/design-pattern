package com.pattern.design.flyweight;

/**
 * @Description 具体享元：白棋
 * @Author yuki
 * @Date 2019/4/19 9:15
 * @Version 1.0
 **/
public class WhiteChessman extends IgoChessman{
    @Override
    public String chessColor() {
        return "白色";
    }
}
