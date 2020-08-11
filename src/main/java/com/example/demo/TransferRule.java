package com.example.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)//似乎只有这个时候嫩用
public @interface TransferRule {
    String action() default "transfer";
    int money() default 10000;
    User user1=new User(false);
    Class<?> testCase() default User.class;
}
