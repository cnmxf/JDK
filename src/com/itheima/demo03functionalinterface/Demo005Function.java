package com.itheima.demo03functionalinterface;

import java.util.function.Function;

public class Demo005Function {

    public static void main(String[] args) {
        System.out.println("第一步");
        getNumber(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }


        });
    }



    //**使用Lambda表达式将字符串转成数字**
    public static void getNumber(Function<String , Integer> function){
        Integer apply = function.apply("1111");
        System.out.println(apply);



    }

}
