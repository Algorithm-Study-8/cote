import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] array =  new int[5001];
        Arrays.fill(array, 2000);
        array[3] = 1;
        array[5] = 1;
        for (int i = 6; i < s+1; i++) {
            array[i] = Math.min(array[i-5], array[i-3]) + 1;
        }

        System.out.println(array[s] >= 2000 ? -1 : array[s]);
    }
}