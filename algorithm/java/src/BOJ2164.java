// problem : https://www.acmicpc.net/problem/2164

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {
    static int N; // 카드 개수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i); // 1, 2, 3, 4
        }

        while (queue.size() != 1) {
            queue.poll(); // 첫 카드 버리기
            int num = queue.poll();
            queue.offer(num); // 두번째 카드 뽑아서 다시 넣기
        }

        System.out.println(queue.poll());
    }
}