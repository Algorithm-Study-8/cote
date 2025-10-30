package algorithms.greedy;

import java.util.Scanner;

/**
 * - Baekjoon Online Judge 5585 - 거스름돈
 * - 풀이 시간 : 5분 30초
 * - 메모리 : 17640KB
 * - 시간 : 172ms
 */

public class Baekjoon_5585 {

    static int[] CHANGE_TYPES = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int needToPay = 1000 - price;
        int changeCount = 0;

        for (int change : CHANGE_TYPES) {
            if (needToPay == 0) break;

            changeCount += needToPay / change;
            needToPay %= change;
        }

        System.out.println(changeCount);

        sc.close();
    }
}
