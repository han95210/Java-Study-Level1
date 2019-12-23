package com.han95210.java.playground.gugudan;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class gugudanMethod {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = calculate(i);
            print(result);
        }
    }

//    public int input() {
//        System.out.println("구구단 중 출력한 단은? :");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println("사용자가 입력한 값 : " + num);
//        return num;
//    }
//
//    public int errorMessage(int num) {
//        JOptionPane message = new JOptionPane();
//        Scanner input = new Scanner(System.in);
//        while (num < 2 || num > 9) {
//            message.showMessageDialog(null, "2이상 9이하의 값을 입력하세요");
//            num = input.nextInt();
//            System.out.println("사용자가 입력한 값 : " + num);
//            if (num >= 2 && num <= 9) {
//                break;
//            }
//        }
//        return num;
//    }
//
//    public static void main(String[] args) {
//        gugudanMethod gugudan = new gugudanMethod();
//        int num = gugudan.input();
//        num = gugudan.errorMessage(num);
//        System.out.println(num + "단 출력");
//        for (int j = 1; j < 10; j++) {
//            System.out.println(num + " * " + j + " = " + (num * j));
//        }
//    }
}
