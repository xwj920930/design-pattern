package com.pattern.design.iterator.MyType;

/**
 * @Description 抽象迭代器（jdk中的Iterator）：定义迭代器的方法
 * @Author yuki
 * @Date 2019/4/25 15:02
 * @Version 1.0
 **/
public interface MyIterator {
    boolean hasNext();
    Object next();
}
