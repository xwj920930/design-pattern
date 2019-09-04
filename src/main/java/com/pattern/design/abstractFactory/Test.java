package com.pattern.design.abstractFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ISkinFactory springSkinFactory = new SpringSkinFactory();
        IButton iButton = springSkinFactory.CreateButton();
        ITextField iTextField = springSkinFactory.CreateTextField();
        IComboBox iComboBox = springSkinFactory.CreateComboBox();
        iButton.Display();
        iTextField.Display();
        iComboBox.Display();
    }
}
