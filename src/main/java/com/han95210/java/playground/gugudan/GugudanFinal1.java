// 최종 요구사항 1
// 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
// 예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단
// (2*1에서 19*19)을 계산해 출력한다.
// 이 요구사항은 실습을 소화했으면 구현할 수 있기 때문에 생략한다.

package com.han95210.java.playground.gugudan;

import javax.swing.JOptionPane;

public class GugudanFinal1 {
    public static void main(String[] arges) {

        String numStr = JOptionPane.showInputDialog(null, "입력하세요.");
        int num = Integer.valueOf(numStr);

        for (int i = 2; i <= num; i++) {
            System.out.println(i + "단 출력");
            for (int j = 1; j <= num; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
