package com.pattern.design.templateMethod;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:54
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        currentAccount.template();
        Account savingAccount = new SavingAccount();
        savingAccount.template();
    }
}
