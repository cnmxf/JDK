package com.itheima.demo03functionalinterface;

import java.util.Locale;
import java.util.function.Consumer;

public class Demo003Consumer {
    public static void main(String[] args) {
        printData((str)->{
            String s = str.toUpperCase();
            System.out.println(s);
        });

    }



    public static void printData(Consumer<String> consumer){
        consumer.accept("hello World");
    }
}

