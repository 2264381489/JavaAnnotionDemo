package com.example.demo;

import lombok.Synchronized;

import java.lang.reflect.Method;

public class BankTranslate {
@SuppressWarnings("all")
@TransferRule
    public static   void transfer() throws NoSuchMethodException, IllegalAccessException, InstantiationException {

    Method transfer = BankTranslate.class.getDeclaredMethod("transfer");
    TransferRule annotation = transfer.getAnnotation(TransferRule.class);
    User user1=new User(false);
    User user2 = new User(false);

    Thief thief=new Thief();
    Thief thief1 = new Thief();
    //确定两个人都不是黑名单中的人
    User o =(User) annotation.testCase().newInstance();
    //没啥意义，你就知道在注解中可以放置Class类型，并且能用就ok了
     Object a=thief;
     Object b=thief1;

    if (a.equals(o)&&b.equals(o)){
        System.out.println("有人不是用户，退出");
        return;
    }
    System.out.println(user1);
    System.out.println(user2);
    //如果其中一个将自己资金的80%转给另一个人
    if(!(user1.getMoney()*0.8>annotation.money())){
       user2.setMoney(user2.getMoney()+user1.getMoney()*8/10);
       user1.setMoney(user1.money*8/10);
        System.out.println(user1);
        System.out.println(user2);
    }else {
        System.out.println("转账金额过大,联系桂圆");
    }
}


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        BankTranslate.transfer();
    }


}
