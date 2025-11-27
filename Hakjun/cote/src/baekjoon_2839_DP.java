import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2839_DP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] sugarList = new int[5001];

        sugarList[0] = Integer.MAX_VALUE;
        sugarList[1] = Integer.MAX_VALUE;
        sugarList[2] = Integer.MAX_VALUE;
        sugarList[3] = 1;
        sugarList[4] = Integer.MAX_VALUE;
        sugarList[5] = 1;

        for (int i = 6; i < n + 1; i++) {
            int max = Math.min(sugarList[i - 3], sugarList[i - 5]);
            sugarList[i] = max == Integer.MAX_VALUE ? Integer.MAX_VALUE : max + 1;
        }

        bw.write(sugarList[n] == Integer.MAX_VALUE ? String.valueOf(-1) : String.valueOf(sugarList[n]));

        bw.flush();
    }
}