package com.pattern.design.interpreter;

/**
 * @Description 非终结表达式：加法
 * @Author yuki
 * @Date 2019/4/26 15:26
 * @Version 1.0
 **/
public class Add extends MyExpression{
    private MyExpression left;
    private MyExpression right;
    public Add(MyExpression left, MyExpression right) {
        this.left = left;
        this.right = right;
    }
    //递归
    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }
}
