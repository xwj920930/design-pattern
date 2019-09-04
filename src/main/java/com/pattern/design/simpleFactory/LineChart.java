package com.pattern.design.simpleFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/1 9:36
 * @Version 1.0
 **/
public class LineChart implements IChartable {
    public LineChart(){
        System.out.println("折线图初始化");
    }
    @Override
    public void Display() {
        System.out.println("显示折线图");
    }
}
