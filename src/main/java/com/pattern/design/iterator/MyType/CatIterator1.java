package com.pattern.design.iterator.MyType;

/**
 * @Description 具体迭代器
 * @Author yuki
 * @Date 2019/4/25 15:21
 * @Version 1.0
 **/
public class CatIterator1 implements MyIterator {
    private int index;
    private CatGroup1 catGroup1;
    public CatIterator1(CatGroup1 catGroup1) {
        this.index =0;
        this.catGroup1 = catGroup1;
    }
    @Override
    public boolean hasNext() {
        return index<catGroup1.getLength();
    }
    @Override
    public Object next() {
        return catGroup1.getByIndex(index++);
    }
}
