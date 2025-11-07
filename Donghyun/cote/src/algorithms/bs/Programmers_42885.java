package algorithms.bs;

import java.io.IOException;
import java.util.Arrays;

/**
 * - Programmers 42885 - 구명 보트
 * - 풀이 시간 : 15분
 * - 메모리 : 100MB
 * - 시간 : 1ms
 */
public class Programmers_42885 {
    public static void main(String[] args) throws IOException {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;

        int cnt = 0;

        Arrays.sort(people);

        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
                r--;
                cnt++;
            } else {
                r--;
                cnt++;
            }
        }

        return cnt;
    }
}
