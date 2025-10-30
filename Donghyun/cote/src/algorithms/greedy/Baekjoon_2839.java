package algorithms.greedy;

import java.util.Scanner;

/**
 * - Baekjoon Online Judge 2839 - 설탕 배달
 * - 풀이 시간 : 8분
 * - 메모리 : 17716KB
 * - 시간 : 172ms
 */
public class Baekjoon_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxOf5kgCount = n / 5;

        for (int i= maxOf5kgCount; i >= 0; i--) {
            int remain = n - (i * 5);
            if (remain % 3 == 0) {
                System.out.println(i + (remain / 3));
                return;
            }
        }

        System.out.println(-1);

        sc.close();
    }
}
