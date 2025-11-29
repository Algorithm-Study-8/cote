import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_1463_DP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] oneArray = new int[1_000_001];

        oneArray[0] = Integer.MAX_VALUE;
        oneArray[1] = 0;

        for (int i = 2; i < n + 1; i++) {
            int a = i % 3 == 0 ? i / 3 : 0;
            int b = i % 2 == 0 ? i / 2 : 0;
            oneArray[i] = Math.min(oneArray[b], oneArray[a]);
            oneArray[i] = Math.min(oneArray[i-1], oneArray[i]) + 1;
        }

        bw.write(String.valueOf(oneArray[n]));
        bw.flush();
    }
}