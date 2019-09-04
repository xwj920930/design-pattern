package com.pattern.design.interpreter;

/**
 * @Description 终结表达式：变量
 * @Author yuki
 * @Date 2019/4/26 15:34
 * @Version 1.0
 **/
public class Var extends MyExpression{
    private String key;
    public Var(String key) {
        this.key = key;
    }
    @Override
    public int interpret(Context context) {
        return context.getValue(key);
    }
}
