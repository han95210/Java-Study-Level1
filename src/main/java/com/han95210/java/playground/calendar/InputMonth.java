package com.han95210.java.playground.calendar;

import java.util.Scanner;

public class InputMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("달을 입력하세요.");
        int num = input.nextInt();

        int[][] a = {{1,2,3,4,5,6,7,8,9,10,11,12},{31,29,31,30,31,30,31,31,30,31,30,31}};

        if(num == 1) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][0], a[1][0]);
        } else if (num == 2) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][1], a[1][1]);
        } else if (num == 3) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][2], a[1][2]);
        } else if (num == 4) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][3], a[1][3]);
        } else if (num == 5) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][4], a[1][4]);
        } else if (num == 6) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][5], a[1][5]);
        } else if (num == 7) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][6], a[1][6]);
        } else if (num == 8) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][7], a[1][7]);
        } else if (num == 9) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][8], a[1][8]);
        } else if (num == 10) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][9], a[1][9]);
        } else if (num == 11) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][10], a[1][10]);
        } else if (num == 12) {
            System.out.printf("%d월은 %d일까지 있습니다.", a[0][11], a[1][11]);
        }





//        //if ,else if, else 문
//        if(num == 1) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 1, 31);
//        } else if (num == 2) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 2, 29);
//        } else if (num == 3) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 3, 31);
//        } else if (num == 4) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 4, 30);
//        } else if (num == 5) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 5, 31);
//        } else if (num == 6) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 6, 30);
//        } else if (num == 7) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 7, 31);
//        } else if (num == 8) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 8, 31);
//        } else if (num == 9) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 9, 30);
//        } else if (num == 10) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 10, 31);
//        } else if (num == 11) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 11, 30);
//        } else if (num == 12) {
//            System.out.printf("%d월은 %d일까지 있습니다.", 12, 31);
//        }
        //switch case문
//        switch(num) {
//            case 1:
//                System.out.println("1월은 31일까지 있습니다.");;
//            break;
//            case 2:
//                System.out.println("2월은 29일까지 있습니다.");;
//            break;
//            case 3:
//                System.out.println("3월은 31일까지 있습니다.");;
//            break;
//            case 4:
//                System.out.println("4월은 30일까지 있습니다.");;
//            break;
//            case 5:
//                System.out.println("5월은 31일까지 있습니다.");;
//            break;
//            case 6:
//                System.out.println("6월은 30일까지 있습니다.");;
//            break;
//            case 7:
//                System.out.println("7월은 31일까지 있습니다.");;
//            break;
//            case 8:
//                System.out.println("8월은 31일까지 있습니다.");;
//            break;
//            case 9:
//                System.out.println("9월은 30일까지 있습니다.");;
//            break;
//            case 10:
//                System.out.println("10월은 31일까지 있습니다.");;
//            break;
//            case 11:
//                System.out.println("11월은 30일까지 있습니다.");;
//            break;
//            case 12:
//                System.out.println("12월은 31일까지 있습니다.");;
//            break;
//            default :
//                System.out.println("1~12 숫자중 하나만 입력해주세요");
//            break;
//
//        }


    }
}
