package com.pattern.design.iterator.jdkType;

import java.util.Iterator;

/**
 * @Description 可以和CatIterator1一样，但是这里用内部类(catGroup2)
 * @Author yuki
 * @Date 2019/4/25 15:41
 * @Version 1.0
 **/
public class CatIterator2 implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
