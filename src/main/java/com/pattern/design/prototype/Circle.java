package com.pattern.design.prototype;

import java.util.Date;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/1 9:36
 * @Version 1.0
 **/
public class Circle extends Shape {
    Circle(String id, Date time) {
        super(id, time);
    }
    @Override
    void draw() {
        System.out.println("circle draw");
    }
}
