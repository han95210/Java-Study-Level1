package com.han95210.java.playground.gugudan;

public class gugudan67 {
    public static void main(String[] args) {
        int i = 6;
        int j = 1;
        System.out.println(i + "단 출력");
        while(j < 10) {
            System.out.println(i + " * " + j + " = " + (i * j));
            j++;
        }

        if (j == 10) {
            int k = 1;
            int m = 7;
            System.out.println(m + "단 출력");
            while(k < 10) {
                System.out.println(m + " * " + k + " = " + (m * k));
                k++;
            }
        }

    }
}
