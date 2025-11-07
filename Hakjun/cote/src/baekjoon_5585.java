import java.util.Scanner;

/**
 * 500원부터 1원까지 다양한 동전이 있다.
 * 물건 가격을 입력했을 때, 최소 동전의 거스름돈을 주는 프로그램을 만들자.
 * 입력: 1_000 이하 숫자
 * 출력: 최소 동전 개수
 *
 * 풀이 시간 : 5분
 * 메모리 : 17584KB
 * 시간 : 172ms
 */
public class baekjoon_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] changeList = new int[]{500, 100, 50, 10, 5, 1};
        int productPrice = sc.nextInt();
        int change = 1_000 - productPrice;

        int result = 0;
        for (int j : changeList) {
            if (change >= j) {
                int temp = change / j;
                change -= j * temp;
                result += temp;
            }
        }
        System.out.println(result);
    }
}