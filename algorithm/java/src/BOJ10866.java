// problem : https://www.acmicpc.net/problem/10866

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ10866 {
    static int N;
    static Deque<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("push_front")) {
                int num = Integer.parseInt(cmd.substring(cmd.indexOf(" ") + 1));
                deque.addFirst(num);
            } else if (cmd.startsWith("push_back")) {
                int num = Integer.parseInt(cmd.substring(cmd.indexOf(" ") + 1));
                deque.addLast(num);
            } else if (cmd.startsWith("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append(-1);
                } else {
                    int num = deque.pollFirst();
                    sb.append(num);
                }
                sb.append("\n");
            } else if (cmd.startsWith("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append(-1);
                } else {
                    int num = deque.pollLast();
                    sb.append(num);
                }
                sb.append("\n");
            } else if (cmd.startsWith("size")) {
                sb.append(deque.size()).append("\n");
            } else if (cmd.startsWith("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else if (cmd.startsWith("front")) {
                if (deque.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(deque.peek());
                }
                sb.append("\n");
            } else {
                if (deque.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(deque.peekLast());
                }
                sb.append("\n");
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}

