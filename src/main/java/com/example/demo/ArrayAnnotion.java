package com.example.demo;

import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressWarnings("all")
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.CONSTRUCTOR})
//注解的加载顺序
@Retention(RetentionPolicy.RUNTIME)
public @interface ArrayAnnotion {
//    可以没有default
    String[] annotion();

}
