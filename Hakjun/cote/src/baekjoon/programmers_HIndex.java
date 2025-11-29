package baekjoon;

public class programmers_HIndex {
    public void main(String[] args) {
        int[] people = new int[]{3, 0, 6, 1, 5};
        System.out.println(solution(people));
    }

    public int solution(int[] citations) {
        int answer = 0;

        for (int i = 0; i < citations.length + 1; i++) {
            int count = 0;
            for (int c : citations) {
                if (c >= i) {
                    count++;
                }
            }
            if (count >= i) {
                answer = i;
            }
        }
        return answer;
    }
}