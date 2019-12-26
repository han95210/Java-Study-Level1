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

            if (month > 12) {
                continue;
            }

            cal.printCalender(year, month);
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
