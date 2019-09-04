package com.pattern.design.prototype;

import java.util.Date;

public abstract class Shape implements Cloneable{
    private String id;
    private Date time;
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    Shape(String id,Date time){
        this.id=id;
        this.time=time;
    }
    abstract void draw();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深克隆
        Shape o= (Shape) super.clone();
        o.time= (Date) time.clone();
        return o;
    }
    @Override
    public String toString() {
        return id+";"+time;
    }
}
