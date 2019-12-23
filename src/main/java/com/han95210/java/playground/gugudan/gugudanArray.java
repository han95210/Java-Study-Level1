package com.han95210.java.playground.gugudan;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class gugudanArray {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = new int[9];
            for (int j = 0; j < result.length; j++) {
                result[j] = i * (j + 1);
            }
            System.out.println("\n" + i + "단 출력");
            for (int j = 0; j < result.length; j++) {
                System.out.println(i + " * " + (j+1) + " = " + result[j]);
            }
        }
//        int[] num = new int[9];
//        num[0] = 2;
//        num[1] = 4;
//        num[2] = 6;
//        num[3] = 8;
//        num[4] = 10;
//        num[5] = 12;
//        num[6] = 14;
//        num[7] = 16;
//        num[8] = 18;
//        System.out.println("2단 출력");
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("2 * " + (i+1) + " = " + num[i]);
        }
    }