package com.itheima.demo03functionalinterface;

import java.util.function.Predicate;

public class Demo007Predicate {


    public static void main(String[] args) {
        isLongName((s)->{
            return s.length()>3;
        });
    }



    public static void isLongName(Predicate<String>predicate){
        System.out.println("aaa");
        boolean b = predicate.test("孟祥飞1");
        System.out.println(b);

    }
}
