package com.pattern.design.interpreter;

/**
 * @Description 非终结表达式：乘法
 * @Author yuki
 * @Date 2019/4/26 15:26
 * @Version 1.0
 **/
public class Mul extends MyExpression{
    private MyExpression left;
    private MyExpression right;
    public Mul(MyExpression left, MyExpression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret(Context context) {
        return left.interpret(context)*right.interpret(context);
    }
}
