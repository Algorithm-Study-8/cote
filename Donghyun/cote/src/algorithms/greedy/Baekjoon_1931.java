package algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * - Baekjoon Online Judge 1931 - 회의실 배정
 * - 풀이 시간 : 10분
 * - 메모리 : 177344KB(Scanner) -> 51676KB(BufferedReader)
 * - 시간 : 1104ms(Scanner) -> 488ms(BufferedReader)
 */
public class Baekjoon_1931 {

    public static class Meeting implements Comparable<Meeting> {
        int startTime;
        int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Meeting other) {
            if (this.endTime == other.endTime) {
                return this.startTime - other.startTime;
            }
            return this.endTime - other.endTime;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Meeting> meetings = new PriorityQueue<>();

        for (int i=0 ; i < n ; i++) {
            String[] times = br.readLine().split(" ");
            int startTime = Integer.parseInt(times[0]);
            int endTime = Integer.parseInt(times[1]);
            meetings.add(new Meeting(startTime, endTime));
        }

        int maxMeetings = 0;
        int lastEndTime = 0;

        while (!meetings.isEmpty()) {
            Meeting meeting = meetings.poll();
            if (meeting.startTime < lastEndTime) continue;

            maxMeetings++;
            lastEndTime = meeting.endTime;
        }

        System.out.println(maxMeetings);

    }
}
