package com.pattern.design.interpreter;

/**
 * @Description
 * (A+B)-C:A+B,*-C是表达式对象，解释方法返回递归解释方法，如果还是表达式继续递归直到变量，
 * A，B，C是变量对象，解释方法返回A，B，C的值
 *
 * @Author yuki
 * @Date 2019/4/26 11:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Context context=new Context();
        context.addValue("a",6);
        context.addValue("b",9);
        context.addValue("c",1);
        MyExpression a=new Var("a");
        MyExpression b=new Var("b");
        MyExpression c=new Var("c");
        MyExpression mul = new Mul(a, b);
        MyExpression sub = new Sub(a, b);
        MyExpression add = new Add(sub, c);
        MyExpression div = new Div(mul, add);
        System.out.println(context.getValueMap());
        System.out.println("(a*b)/(a-b+c)="+div.interpret(context));
    }
}
