package com.itheima.demo03functionalinterface;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo002Supplier {
    public static void main(String[] args) {
        System.out.println("开始了");
        printMax(()->{
          int[] arr = {11,33,44,22,66};
            Arrays.sort(arr);//默认升序
            return arr[arr.length-1];
        });
    }




    public static void printMax(Supplier<Integer> supplier){
        System.out.println("开始");
        Integer a = supplier.get();
        System.out.println(a);
    }
}



