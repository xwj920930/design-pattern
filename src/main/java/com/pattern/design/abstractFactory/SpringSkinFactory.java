package com.pattern.design.abstractFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/8 11:25
 * @Version 1.0
 **/
public class SpringSkinFactory implements ISkinFactory {
    @Override
    public IButton CreateButton() {
        return new SpringButton();
    }

    @Override
    public ITextField CreateTextField() {
        return new SpringTextField();
    }

    @Override
    public IComboBox CreateComboBox() {
        return new SpringComboBox();
    }
}
