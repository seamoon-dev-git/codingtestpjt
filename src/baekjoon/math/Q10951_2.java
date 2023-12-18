package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 문제 URL : https://www.acmicpc.net/problem/10951
 * 문제 제목 : A+B - 4
 * 문제 내용
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * hasNextInt() 사용
 */
public class Q10951_2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int num1, num2 = 0;

        while (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            System.out.println(num1 + num2);

        }

    }
}
