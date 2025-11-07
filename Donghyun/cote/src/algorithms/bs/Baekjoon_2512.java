package algorithms.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * - Baekjoon Online Judge 2512 - 예산
 * - 풀이 시간 : 7분
 * - 메모리 : 15376KB
 * - 시간 : 144ms
 */
public class Baekjoon_2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] budgets = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i=0 ; i < n ; i++) {
            budgets[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, budgets[i]);
        }

        int m = Integer.parseInt(br.readLine());

        int l = 0;
        int r = max;
        int result = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            long sum = 0;

            for (int budget : budgets) {
                sum += Math.min(budget, mid);
            }

            if (sum <= m) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(result);
    }
}
