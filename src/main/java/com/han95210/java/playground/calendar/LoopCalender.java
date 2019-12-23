package com.han95210.java.playground.calendar;

import java.util.Scanner;

public class LoopCalender {

    private static final int[] MAX_DAY = {31,28,31,30,31,30,31,31,30,31,30,31};

    public int MaxDaysOfMonth(int num) {
        return MAX_DAY[num];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LoopCalender lp = new LoopCalender();
        System.out.println("몇 월까지 출력할까요?");
        int num = input.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.printf("%d월은 %d일까지 있습니다.\n", i+1, lp.MaxDaysOfMonth(i));
        }
//        int i = 0;
//        while(i < num) {
//            System.out.printf("%d월은 %d일까지 있습니다.\n", i+1, MaxDays[i]);
//            i++;
//        }

        input.close();
    }
}
