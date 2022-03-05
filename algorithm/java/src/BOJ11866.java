// https://www.acmicpc.net/problem/11866

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11866 {
    static private int N, K;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
           queue.offer(i);
        }

        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                int num = queue.poll();
                queue.offer(num);
            }

            int josephusNum = queue.poll();
            sb.append(josephusNum).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(">");

        System.out.println(sb);
    }
}
