package algorithms.bs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * - Baekjoon Online Judge 1920 - 수 찾기
 * - 풀이 시간 : 3분
 * - 메모리 : 43212KB
 * - 시간 : 600ms
 */
public class Baekjoon_1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] toFinds = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            toFinds[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(nums);

        for (int num : toFinds) {
            if (Arrays.binarySearch(nums, num) < 0) {
                sb.append(0);
            } else {
                sb.append(1);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
