package com.example.demo;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited//这玩应的意思应该是可以被继承
public @interface MyMoney {
    String name() default "yan";
    int money() default 10000;
}
