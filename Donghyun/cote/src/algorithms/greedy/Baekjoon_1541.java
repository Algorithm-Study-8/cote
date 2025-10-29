package algorithms.greedy;

import java.util.Scanner;

/**
 * - Baekjoon Online Judge 1541 - 잃어버린 괄호
 * - 풀이 시간 : 50분
 * - 메모리 : 17668KB
 * - 시간 : 168ms
 */
public class Baekjoon_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        int sum = 0;

        String[] minusSeparated = expression.split("-");

        for (int i=0 ; i<minusSeparated.length; i++) {
            int tempSum = 0;
            String[] plusSeparated = minusSeparated[i].split("\\+");
            for (String num : plusSeparated) {
                tempSum += Integer.parseInt(num);
            }

            if (i == 0) {
                sum += tempSum;
            } else {
                sum -= tempSum;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
