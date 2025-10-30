import week1.Baekjoon_1541Kt;
import week1.Baekjoon_1931Kt;
import week1.Baekjoon_2839Kt;
import week1.Baekjoon_5585Kt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("백준 문제 번호를 입력하세요: ");
        int problemNumber = scanner.nextInt();

        switch (problemNumber) {
            //거스름돈
            case 5585:
                Baekjoon_5585Kt.baekJoon5585();
                break;
            //설탕 배달
            case 2839:
                Baekjoon_2839Kt.baekjoon2839();
                break;
            //잃어 버린 갈호
            case 1541:
                Baekjoon_1541Kt.baekjoon1541();
                break;
            //회의실 배정
            case 1931:
                Baekjoon_1931Kt.baekjoon1931();
                break;

            default:
                System.out.println("해당 문제 번호가 존재하지 않습니다: " + problemNumber);
                break;
        }

        scanner.close();
    }
}