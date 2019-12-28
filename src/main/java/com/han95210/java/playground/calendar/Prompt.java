package com.han95210.java.playground.calendar;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = -1;
        String day = "";

        while (true) {
            System.out.println("연도를 입력하세요.");
            System.out.println("YEAR> ");
            year = scanner.nextInt();
            if (year == -1) {
                break;
            }
            System.out.println("달을 입력하세요.");
            System.out.println("MONTH> ");
            month = scanner.nextInt();
            if (month == -1) {
                break;
            }

            System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA");
            System.out.println("WEEKDAY> ");
            day = scanner.next();

            if (month > 12) {
                continue;
            }

            cal.printCalender(year, month, day);
        }

        System.out.println("Bye~");
        scanner.close();
    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
