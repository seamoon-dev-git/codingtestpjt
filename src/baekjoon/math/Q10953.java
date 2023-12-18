package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 URL : https://www.acmicpc.net/problem/10952
 * 문제 제목 : A+B - 6
 * 문제 내용
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
 * A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 * 5
 * 1,1
 * 2,3
 * 3,4
 * 9,8
 * 5,2
 */
public class Q10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        //테스트케이스 개수
        int count = Integer.parseInt(br.readLine());

        while (count-- > 0) {
            String str = null;
            if ((str = br.readLine()) != null) {
                st = new StringTokenizer(str, ",");
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                System.out.println(num1 + num2);
            }else {
                break;
            }
        }

    }
}
