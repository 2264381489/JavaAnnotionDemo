package com.example.demo;
@MyMoney(name = "chen",money =10000)
public class AnnotionTest {

    public static void annotionTest(){

        Class<AnnotionTest> annotionTestClass=AnnotionTest.class;
        MyMoney annotation = annotionTestClass.getAnnotation(MyMoney.class);
        System.out.println(annotation.name());
        System.out.println(annotation.money());

    }

    public static void main(String[] args) {
        AnnotionTest.annotionTest();
    }

}
