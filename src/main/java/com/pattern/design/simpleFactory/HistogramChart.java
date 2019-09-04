package com.pattern.design.simpleFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/1 9:36
 * @Version 1.0
 **/
public class HistogramChart implements IChartable {
    public HistogramChart(){
        System.out.println("柱状图初始化");
    }
    @Override
    public void Display() {
        System.out.println("显示柱状图");
    }
}
