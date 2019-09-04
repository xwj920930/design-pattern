package com.pattern.design.iterator.MyType;

import com.pattern.design.iterator.Cat;

/**
 * @Description 测试单备忘录
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CatGroup1 group1=new CatGroup1(10);
        group1.append(new Cat(1,"A"));
        group1.append(new Cat(2,"B"));
        group1.append(new Cat(3,"C"));
        group1.append(new Cat(4,"D"));
        MyIterator myIterator = group1.myIterator();
        while (myIterator.hasNext()){
            Cat cat= (Cat) myIterator.next();
            System.out.println(cat);
        }
    }
}
