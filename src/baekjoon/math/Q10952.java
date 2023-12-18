package baekjoon.math;

import java.util.Scanner;

/**
 * 문제 URL : https://www.acmicpc.net/problem/10952
 * 문제 제목 : A+B - 5
 * 문제 내용
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력의 마지막에는 0 두 개가 들어온다.
 */
public class Q10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        while (true) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }
            System.out.println(num1 + num2);

        }
    }
}
