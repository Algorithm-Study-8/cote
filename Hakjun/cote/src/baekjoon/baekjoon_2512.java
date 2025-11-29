package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * - 풀이 시간 : 20분
 * - 메모리 : 31,032KB
 * - 시간 : 380ms
 */
public class baekjoon_2512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] gold = new int[count];
        for (int i = 0; i < count; i++) {
            gold[i] = sc.nextInt();
        }
        int total = sc.nextInt();
        int[] sortedGold = Arrays.stream(gold).sorted().toArray();

        int c;
        int curSum = 0;
        int preSum = 0;
        // 예산액을 넘지 않는 마을의 최대 요청액을 구함.
        for (c = 0; c < count; c++) {
            curSum = 0;
            for (int i = 0; i < c; i++) {
                curSum += sortedGold[i];
            }
            curSum += sortedGold[c] * (count - c);
            if (curSum > total) {
                break;
            }
            preSum = curSum;
        }
        // 총 예산액이 어떤 요청액보다 낮은 경우
        if (c == 0) {
            int pivot = sortedGold[0];
            while (pivot * count > total) {
                pivot--;
            }
            System.out.println(pivot);
        }
        // 총 예산액이 어떤 요청액보다 높은 경우
        else if (curSum <= total) {
            System.out.println(sortedGold[c - 1]);
        }
        // 총 예산액이 요청액들 사이에 있는 경우
        else {
            int a = (total - preSum) / (count - c);
            System.out.println(sortedGold[c - 1] + a);
        }
    }
}