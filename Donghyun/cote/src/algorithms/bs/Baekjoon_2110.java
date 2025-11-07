package algorithms.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * - Baekjoon Online Judge 2110 - 공유기 설치
 * - 풀이 시간 : 15분
 * - 메모리 : 30248KB
 * - 시간 : 280ms
 */
public class Baekjoon_2110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] houses = new int[n];
        for (int i=0 ; i < n ; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        int l = 1;
        int r = houses[n-1] - houses[0];
        int result = 0;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (isPossible(mid, houses, c)) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(result);
    }

    private static boolean isPossible(int mid, int[] houses, int c) {
        int cnt = 1;
        int before = houses[0];

        for (int i=0 ; i < houses.length ; i++) {
            if (houses[i] - before >= mid) {
                cnt++;
                before = houses[i];
            }
        }

        return cnt >= c;
    }
}
