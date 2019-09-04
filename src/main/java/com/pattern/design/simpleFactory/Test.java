package com.pattern.design.simpleFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        IChartable histogramChar = CharFactory.getChar("histogramChart");
        histogramChar.Display();
        IChartable lineChar = CharFactory.getChar("lineChart");
        lineChar.Display();
    }
}
