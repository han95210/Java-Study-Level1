package com.han95210.java.playground.gugudan;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class gugudan89 {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력한 단은? :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("사용자가 입력한 값 : " + num);
        JOptionPane message = new JOptionPane();
        System.out.println(num);

        while (num < 2 || num > 9) {
            message.showMessageDialog(null, "2이상 9이하의 값을 입력하세요");
            num = input.nextInt();
            System.out.println("사용자가 입력한 값 : " + num);
            if (num >= 2 && num <= 9) {
                break;
            }
        }
        System.out.println(num + "단 출력");
        for (int j = 1; j < 10; j++) {
            System.out.println(num + " * " + j + " = " + (num * j));
        }
    }
}

    // 메세지창에서 바로 입력값 받기
//    public static void main(String[] args) {
//        JOptionPane message = new JOptionPane();
//        String a = JOptionPane.showInputDialog(null, "값을 입력하세용");
//        int num = Integer.valueOf(a);
//        while (num < 2 || num > 9) {
//            message.showMessageDialog(null, "2이상 9이하의 숫자를 입력하세요.");
//            a = JOptionPane.showInputDialog(null, "값을 입력하세용");
//            num = Integer.valueOf(a);
//            if (num >= 2 && num <= 9) {
//                break;
//            }
//        }
//        System.out.println(num + "단 출력");
//        for (int j = 1; j < 10; j++) {
//            System.out.println(num + " * " + j + " = " + (num * j));
//        }
//    }
//}
        //콘솔창에 입력하여 값 받기
