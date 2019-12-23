// 최종 요구사항 2
// 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
// 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
// 팔칠단은 2*1, ... 2*7, 3*1... 3*7,..., 8*1...8*7까지 구현하는
// 것을 의미한다.

package com.han95210.java.playground.gugudan;

import javax.swing.JOptionPane;

public class GugudanFinal2 {

    public static void main(String[] args) {
        String strNum = JOptionPane.showInputDialog(null, "입력하세요.");
        String[] Num = strNum.split(",");
        int n1 = Integer.valueOf(Num[0]);
        int n2 = Integer.valueOf(Num[1]);

        for (int i = 2; i <= n1; i++) {
            System.out.println(i + "단 출력");
            for (int j = 1; j <= n2; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
