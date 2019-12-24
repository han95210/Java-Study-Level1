package com.han95210.java.playground.calendar;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReturnValue {
    public static void main(String[] args) {
        System.out.print("월을 입력하세요." + "\n" + ">");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);
    }
}
