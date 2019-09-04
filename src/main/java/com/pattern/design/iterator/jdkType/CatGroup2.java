package com.pattern.design.iterator.jdkType;

import com.pattern.design.iterator.Cat;

import java.util.Iterator;

/**
 * @Description 具体聚合类
 * @Author yuki
 * @Date 2019/4/25 15:40
 * @Version 1.0
 **/
//实现iterable接口
public class CatGroup2 implements Iterable<Cat> {
    private int last;
    //引入需要迭代的数组
    private Cat[] cats;
    public CatGroup2(int size){
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
    public Iterator iterator() {
        //使用匿名内部类，这样可以直接使用外部类的属性
        return new Iterator() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<getLength();
            }
            @Override
            public Object next() {
                return cats[index++];
            }
        };
    }
}
