package algorithms.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * - Baekjoon Online Judge 10815 - 숫자 카드
 * - 풀이 시간 : 7분
 * - 메모리 : 111348KB
 * - 시간 : 1188ms
 */
public class Baekjoon_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0 ; i < n ; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] toFinds = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i=0 ; i < m ; i++) {
            toFinds[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i < m ; i++) {
            if (Arrays.binarySearch(cards, toFinds[i]) < 0) {
                sb.append(0);
            } else {
                sb.append(1);
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
