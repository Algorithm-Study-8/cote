import java.util.Scanner;

public class baekjoon_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 0;
        for (int i = 2; i < n+1; i++) {
            array[i] = array[i-1] + 1;
            if (i % 2 == 0) array[i] = Math.min(array[i], array[i/2] + 1);
            if (i % 3 == 0) array[i] = Math.min(array[i], array[i/3] + 1);
        }
        System.out.println(array[n]);
    }
}