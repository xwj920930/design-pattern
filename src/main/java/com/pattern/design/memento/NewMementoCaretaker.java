package com.pattern.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 备忘录管理者：存储备忘录
 * 存储多备忘录
 * @Author yuki
 * @Date 2019/4/24 9:39
 * @Version 1.0
 **/
public class NewMementoCaretaker {
    private List<ChessmanMemento> mementos=new ArrayList<>();
    public ChessmanMemento getMemento(int i){
        return mementos.get(i);
    }
    public void setMemento(ChessmanMemento memento){
        mementos.add(memento);
    }
}
