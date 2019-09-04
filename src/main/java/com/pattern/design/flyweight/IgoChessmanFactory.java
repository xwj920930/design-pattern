package com.pattern.design.flyweight;

import java.util.HashMap;

/**
 * @Description 享元工厂：运用单例模式，工厂模式
 * @Author yuki
 * @Date 2019/4/19 9:49
 * @Version 1.0
 **/
public class IgoChessmanFactory {
//    也能这样写//享元池，分为黑/白池
//    private static HashMap<String,IgoChessman> chessmanHashMap=new HashMap<>();
    //单例
    private static IgoChessmanFactory igoChessmanFactory=new IgoChessmanFactory();
    //享元池，分为黑/白池
    private static HashMap<String,IgoChessman> chessmanHashMap;
    //访问权限私有
    private IgoChessmanFactory(){
        chessmanHashMap=new HashMap<>();
        IgoChessman white=new WhiteChessman();
        chessmanHashMap.put("white",white);
        IgoChessman black=new BlackChessman();
        chessmanHashMap.put("black",black);
    }
    public static IgoChessmanFactory getIgoChessmanFactoryInstance(){
        return igoChessmanFactory;
    }
    public IgoChessman getIgoChessman(String key){
        return chessmanHashMap.get(key);
    }
}
