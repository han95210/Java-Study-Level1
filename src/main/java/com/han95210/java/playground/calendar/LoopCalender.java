package com.han95210.java.playground.calendar;

import java.util.Scanner;

public class LoopCalender {

    private static final int[] MAX_DAY = {31,28,31,30,31,30,31,31,30,31,30,31};

    public int MaxDaysOfMonth(int num) {
        return MAX_DAY[num];
    }

    public static void main(String[] args) {
        LoopCalender lc = new LoopCalender();
        Scanner scan = new Scanner(System.in);
        System.out.println("몇 번 반복할까요?");
        int repeat = scan.nextInt();

        String prompt = "cal> ";

        for (int i = 0; i < repeat; i++) {
            System.out.print("몇 월을 출력할까요?\n" + prompt);

            int num = scan.nextInt();
            if (num == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (num > 12 || num < 1) {
                System.out.println("다시 입력해주세요");
                i--;
                continue;
            }
            System.out.printf("%d월은 %d일까지 있습니다.\n", num, lc.MaxDaysOfMonth(num - 1));
        }
        scan.close();
    }
}
