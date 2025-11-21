package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * - 풀이 시간 : 5분
 * - 메모리 : 53,204KB
 * - 시간 : 612ms
 */
public class baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < count; i++) {
            map.put(arr[i], arr[i]);
        }

        count = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < count; i++) {
            if (map.containsKey(arr[i])) {
                bw.write("1" + "\n");
            } else {
                bw.write("0" + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
