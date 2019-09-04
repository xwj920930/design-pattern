package com.pattern.design.interpreter;

/**
 * @Description 抽象表达式：整数的加减乘除
 * @Author yuki
 * @Date 2019/4/26 14:42
 * @Version 1.0
 **/
public abstract class MyExpression {
    //解释,其中context变量只有var才用得到
    public abstract int interpret(Context context);
}
