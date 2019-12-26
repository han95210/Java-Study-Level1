package com.han95210.java.playground.calendar;

import java.util.Scanner;

public class VirtualCalender {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualCalender vc = new VirtualCalender();

        while(true) {
            System.out.println("\n월을 입력하세요");
            System.out.println(">");
            int month = input.nextInt();
            if (month == -1) {
                    System.out.println("Bye~");
                break;
            } else if (month < 1 || month > 12) {
                System.out.println("1~12 사이 숫자만 입력 가능합니다.");
                continue;
            }
            switch(month) {
                case 1: vc.printSampleCalender1();
                break;
                case 2: vc.printSampleCalender2();
                break;
                case 3: vc.printSampleCalender3();
                break;
                case 4: vc.printSampleCalender4();
                break;
                case 5: vc.printSampleCalender5();
                break;
                case 6: vc.printSampleCalender6();
                break;
                case 7: vc.printSampleCalender7();
                break;
                case 8: vc.printSampleCalender8();
                break;
                case 9: vc.printSampleCalender9();
                break;
                case 10: vc.printSampleCalender10();
                break;
                case 11: vc.printSampleCalender11();
                break;
                case 12: vc.printSampleCalender12();
                break;
            }
        }
        input.close();
    }
    public void printSampleCalender1() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
    public void printSampleCalender2() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }
    public void printSampleCalender3() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
    public void printSampleCalender4() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30");
    }
    public void printSampleCalender5() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
    public void printSampleCalender6() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30");
    }
    public void printSampleCalender7() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
    public void printSampleCalender8() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
    public void printSampleCalender9() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30");
    }
    public void printSampleCalender10() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
    public void printSampleCalender11() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30");
    }
    public void printSampleCalender12() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
        System.out.println("29 30 31");
    }
}
