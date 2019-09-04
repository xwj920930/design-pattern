package com.pattern.design.strategy;

import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        double price=100;
        MovieTicket studentTicket=new MovieTicket(price,new StudenDiscount());
        System.out.println(studentTicket.caculate());
        MovieTicket childrenTicket=new MovieTicket(price,new ChildrenDiscount());
        System.out.println(childrenTicket.caculate());
    }
}
