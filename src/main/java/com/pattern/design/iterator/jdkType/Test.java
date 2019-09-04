package com.pattern.design.iterator.jdkType;

import com.pattern.design.iterator.Cat;
import com.pattern.design.iterator.MyType.CatGroup1;
import com.pattern.design.iterator.MyType.MyIterator;

import java.util.Iterator;

/**
 * @Description 测试单备忘录
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CatGroup2 group2=new CatGroup2(10);
        group2.append(new Cat(1,"A"));
        group2.append(new Cat(2,"B"));
        group2.append(new Cat(3,"C"));
        group2.append(new Cat(4,"D"));
        Iterator iterator = group2.iterator();
        while (iterator.hasNext()){
            Cat cat= (Cat) iterator.next();
            System.out.println(cat);
        }
    }
}
