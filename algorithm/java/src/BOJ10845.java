// problem : https://www.acmicpc.net/problem/10845

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ10845 {
    static int N;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("push")) {
                int num = Integer.parseInt(cmd.substring(5));
                queue.offer(num);
            } else if (cmd.startsWith("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1);
                } else {
                    int num = queue.poll();
                    sb.append(num);
                }
                sb.append("\n");
            } else if (cmd.startsWith("size")) {
                sb.append(queue.size()).append("\n");
            } else if (cmd.startsWith("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else if (cmd.startsWith("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(queue.peek());
                }
                sb.append("\n");
            } else {
                if (queue.isEmpty()) {
                    sb.append(-1);
                } else {
                    int num = getLast();
                    sb.append(num);
                }
                sb.append("\n");
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static int getLast() {
        int result = 0;

        for (int j = 0, size = queue.size(); j < size; j++) {
            int num = queue.poll();
            if (j == size - 1) {
                result = num;
            }

            queue.offer(num);
        }

        return result;
    }
}
