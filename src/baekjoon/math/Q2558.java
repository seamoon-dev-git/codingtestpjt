package baekjoon.math;

import java.util.Scanner;

/**
 * 문제 URL : https://www.acmicpc.net/problem/2558
 * 문제 제목 : A+B-2
 * 문제 내용
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Q2558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2 - 2);
    }
}
