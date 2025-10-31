import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 회의실 배정 최대한 많은 회의를 배정하자
 */
public class BOJ1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] list = new int[count][2];

        for (int i = 0; i < count; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        Arrays.sort(list, Comparator.comparingInt((int[] x) -> x[1]).thenComparingInt((int[] x) -> x[0]));

        int max = 0;
        int result = 0;

        for (int[] arr : list) {
            if (arr[0] >= max) {
                result++;
                max = arr[1];
            }
        }

        System.out.println(result);
    }
}
