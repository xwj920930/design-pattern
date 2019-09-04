package com.pattern.design.iterator.MyType;

/**
 * 抽象聚合类(jdk中的iterable)
 *该接口中只有一个方法, 这个方法用于生成一个迭代器
 */
public interface Aggregate {
    MyIterator myIterator();
}
