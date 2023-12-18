package baekjoon.math;

import java.util.Scanner;

/**
 * 문제 URL : https://www.acmicpc.net/problem/10950
 * 문제 제목 : A+B - 3
 * 문제 내용
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Q10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int num1 = 0;
        int num2 = 0;

        while (count -- > 0) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(num1 + num2);
        }
    }
}
