package baekjoon.math;


import java.util.Scanner;

/**
 * 문제 URL : https://www.acmicpc.net/problem/11021
 * 문제 제목 : A+B - 7
 * 문제 내용
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 */
public class Q11021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= count; i++) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println("Case #" + i + ": " + (num1 + num2));
        }

    }
}
