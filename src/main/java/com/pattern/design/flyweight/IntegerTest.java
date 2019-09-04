package com.pattern.design.flyweight;

/**
 * @Description Integer.valueOf享元模式
 * @Author yuki
 * @Date 2019/4/19 11:11
 * @Version 1.0
 **/
public class IntegerTest {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(127);
        Integer b=new Integer(127);
        System.out.println(a==b);
        //当int类型和Integer比较的时候会自动的拆箱也就是只比较里面的值大小是否相等
        int c=127;
        System.out.println(a==c);
        System.out.println(b==c);
    }
}
