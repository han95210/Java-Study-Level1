package com.han95210.java.playground.gugudan;

public class GugudanMain {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = gugudanClass.calculate(i);
            gugudanClass.print(result);
        }
    }
}
