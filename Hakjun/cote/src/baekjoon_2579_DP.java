import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2579_DP {
    static int[] totalArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        totalArray = new int[301];
        int[] score = new int[301];

        totalArray[0] = 0;
        score[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        totalArray[1] = score[1];
        totalArray[2] = score[2] + score[1];

        // t-i = max(연속 밟기, 1칸 건너 뛰기)
        for (int i = 3; i < n + 1; i++) {
            totalArray[i] = Math.max(
                    totalArray[i - 3] + score[i] + score[i - 1],
                    totalArray[i - 2] + score[i]
            );
        }

        bw.write(String.valueOf(totalArray[n]));
        bw.flush();
    }
}