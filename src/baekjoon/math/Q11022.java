package baekjoon.math;

import java.util.Scanner;

/**
 * 문제 URL : https://www.acmicpc.net/problem/11022
 * 문제 제목 : A+B - 8
 * 문제 내용
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class Q11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= count; i++) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
