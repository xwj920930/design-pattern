package com.pattern.design.flyweight;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/4 10:12
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        IgoChessmanFactory instance = IgoChessmanFactory.getIgoChessmanFactoryInstance();
        IgoChessman white1 = instance.getIgoChessman("white");
        IgoChessman white2 = instance.getIgoChessman("white");
        System.out.println(white1==white2);
        IgoChessman black1 = instance.getIgoChessman("black");
        IgoChessman black2 = instance.getIgoChessman("black");
        System.out.println(black1==black2);
        white1.display(new Coordinate(1,1));
        white2.display(new Coordinate(1,2));
        black1.display(new Coordinate(2,1));
        black2.display(new Coordinate(2,2));
    }
}
