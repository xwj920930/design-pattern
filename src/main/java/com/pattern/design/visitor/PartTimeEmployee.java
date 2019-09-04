package com.pattern.design.visitor;

/**
 * @Description 具体元素：兼职员工
 * @Author yuki
 * @Date 2019/4/23 10:28
 * @Version 1.0
 **/
public class PartTimeEmployee implements Employee {
    private String name;
//    private double weeklyWage;
//    private int workTime;
    public PartTimeEmployee(String name) {
        this.name = name;
//        this.weeklyWage = weeklyWage;
//        this.workTime = workTime;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public double getWeeklyWage() {
//        return weeklyWage;
//    }
//    public void setWeeklyWage(double weeklyWage) {
//        this.weeklyWage = weeklyWage;
//    }
//    public int getWorkTime() {
//        return workTime;
//    }
//    public void setWorkTime(int workTime) {
//        this.workTime = workTime;
//    }
    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}
