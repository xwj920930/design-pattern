package com.pattern.design.iterator.MyType;

import com.pattern.design.iterator.Cat;

/**
 * @Description 具体聚合类
 * @Author yuki
 * @Date 2019/4/25 15:15
 * @Version 1.0
 **/
public class CatGroup1 implements Aggregate {
    private int last;
    private Cat[] cats;
    public CatGroup1(int size){
        last=0;
        this.cats=new Cat[size];
    }
    public Cat getByIndex(int index){
        return cats[index];
    }
    public void append(Cat cat){
        cats[last++]=cat;
    }
    public int getLength(){
        return last;
    }
    @Override
    public MyIterator myIterator() {
        return new CatIterator1(this);
    }
}
