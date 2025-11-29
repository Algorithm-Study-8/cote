package baekjoon;

import java.util.Arrays;

public class programmers_lifeboat {
    public static void main(String[] args) {
        int[] people = new int[]{70, 50, 80, 50};
        System.out.println(solution(people, 100));
    }

    public static int solution(int[] people, int limit) {
        int[] sortedPeople = Arrays.stream(people).sorted().toArray();
        int len = 0;
        int count = 0;
        for (int i = sortedPeople.length - 1; i >= len; i--) {
            if (limit >= sortedPeople[i] + sortedPeople[len]) {
                len++;
            }
            count++;
        }
        return count;
    }
}