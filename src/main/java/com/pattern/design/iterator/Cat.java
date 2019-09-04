package com.pattern.design.iterator;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/25 15:13
 * @Version 1.0
 **/
public class Cat {
    private int age;
    private String name;
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
