package com.han95210.java.playground.gugudan;

import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        String str = "";

        for(int i = 0; i < 5; i++){
            str += i + "#";
        }
        System.out.println(str);

        String[] array = str.split("#");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
