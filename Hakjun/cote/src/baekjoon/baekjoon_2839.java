package baekjoon;

import java.util.Scanner;

/**
 * 입력값을 x5+y3으로 표현할 때, x+y의 최소값은 무엇인가?
 *
 * 풀이 시간 : 5분
 * 메모리 : 14368KB
 * 시간 : 100ms
 */
public class baekjoon_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 5;
        int s = n % 5;
        while (true) {
            if (s % 3 == 0) {
                System.out.println(s / 3 + a);
                break;
            }
            if (a == 0) {
                System.out.println("-1");
                break;
            }
            a--;
            s += 5;
        }
    }
}