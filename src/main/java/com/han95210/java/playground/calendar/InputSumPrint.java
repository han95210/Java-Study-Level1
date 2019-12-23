package com.han95210.java.playground.calendar;

import java.util.Scanner;

public class InputSumPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("두 수의 합은 " + (n1 + n2) + "입니다.");

        input.close();

    }
}
