package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 수식을 입력했다. 괄호를 임의로 추가하여, 가장 작은 수를 만들어라.
 * 덧셈을 완료한 뒤, 뺄셈을 계산하자
 *
 * 풀이 시간 : 30분
 * 메모리 : 17788KB
 * 시간 : 168ms
 */
public class baekjoon_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] numbers = input.split("[+-]");
        int[] numberList = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        List<Character> operations = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (c != '+' && c != '-') {
                continue;
            }

            operations.add(c);
        }

        for (int i = operations.size() - 1; i >= 0; i--) {
            if (operations.get(i) == '+') {
                numberList[i] += numberList[i + 1];
                numberList[i + 1] = 0;
            }
        }

        int result = numberList[0];
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i) == '-') {
                result -= numberList[i + 1];
            }
        }
        System.out.println(result);
    }
}