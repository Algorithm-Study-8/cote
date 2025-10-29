package algorithms.greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * - Programmers 1931 - 소수 찾기
 * - 풀이 시간 : 40분
 * - 메모리 : 100MB
 * - 시간 : 220ms
 */
public class Programmers_42839 {
    private static int MAX = 10000000;
    private static boolean[] primes = new boolean[MAX];
    private static Set<Integer> primeSet;

    public static void main(String[] args) {

        calculatePrime();
        String numbers = "011";

        int len = numbers.length();
        char[] numberArr = numbers.toCharArray();

        primeSet = new HashSet<>();

        for (int i=1 ; i <= len ; i++){
            makeNum(numberArr, i);
        }

        System.out.println(primeSet.size());
    }

    private static void makeNum(char[] arr, int size) {
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[arr.length];
        DFS(sb, 0, visited, arr, size);
    }

    private static void DFS (StringBuilder cur, int idx, boolean[] visited, char[] arr, int size) {
        if (cur.length() == size) {
            int num = Integer.parseInt(cur.toString());
            if (primes[num]) {
                primeSet.add(num);
            }
            return;
        }

        for (int i=0 ; i < arr.length ; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            DFS(cur.append(arr[i]), i, visited, arr, size);
            visited[i] = false;
            cur.deleteCharAt(cur.length()-1);
        }
    }

    private static void calculatePrime() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i=2 ; i * i < MAX ; i++) {
            for (int j = i + i ; j < MAX ; j += i) {
                primes[j] = false;
            }
        }
    }
}
