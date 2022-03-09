// https://www.acmicpc.net/problem/10828

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10828 {
    private static Stack<Integer> stack = new Stack<>();
    private static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int num = Integer.parseInt(command.substring(5));
                stack.push(num);
            } else if (command.startsWith("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.pop());
                }
                sb.append("\n");
            } else if (command.startsWith("size")) {
                sb.append(stack.size()).append("\n");
            } else if (command.startsWith("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else {
                if (stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.peek());
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
