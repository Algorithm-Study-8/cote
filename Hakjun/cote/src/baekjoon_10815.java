import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * - 풀이 시간 : 5분
 * - 메모리 : 111,348KB
 * - 시간 : 1188ms
 */
public class baekjoon_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int count = sc.nextInt();
        while (count-- > 0) {
            int i = sc.nextInt();
            map.put(i, i);
        }

        int answerCount = sc.nextInt();
        boolean[] answer = new boolean[answerCount];
        for (int i = 0; i < answerCount; i++) {
            int c = sc.nextInt();
            answer[i] = map.containsKey(c);
        }

        for (boolean b : answer) {
            if (b) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
