package com.pattern.design.simpleFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/1 9:38
 * @Version 1.0
 **/
public class CharFactory {
    public static IChartable getChar(String type){
        IChartable iChartable = null;
        switch (type){
            case "histogramChart":
                iChartable=new HistogramChart();
                break;
            case "lineChart":
                iChartable=new LineChart();
                break;
        }
        return iChartable;
    }
}
