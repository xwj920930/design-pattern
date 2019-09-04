package com.pattern.design.abstractFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/1 9:38
 * @Version 1.0
 **/
public interface ISkinFactory {
    IButton CreateButton();
    ITextField CreateTextField();
    IComboBox CreateComboBox();
}
