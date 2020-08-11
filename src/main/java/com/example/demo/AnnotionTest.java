package com.example.demo;
@MyMoney(name = "chen",money =10000)
@ArrayAnnotion(annotion = {"src","dev"})
public class AnnotionTest {

    public static void annotionTest(){

        Class<AnnotionTest> annotionTestClass=AnnotionTest.class;
        MyMoney annotation = annotionTestClass.getAnnotation(MyMoney.class);
        System.out.println(annotation.name());
        System.out.println(annotation.money());
        //这个是获取@ArrayAnnotion中的数组，得到其中的特性
//        不是Runtime的话就无法被运行时代码获取到。
        //
        ArrayAnnotion annotation1 = annotionTestClass.getAnnotation(ArrayAnnotion.class);
        String[] arr = annotation1.annotion();

        for (String s : arr) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        AnnotionTest.annotionTest();
    }

}
