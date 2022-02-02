// problem : https://www.acmicpc.net/problem/8958

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8958 {
    static int T;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            int sum = 0, total = 0;

            for (int j = 0, size = input.length(); j < size; j++) {
                char ch = input.charAt(j);

                if (ch == 'O') {
                    sum++;
                    total += sum;
                } else {
                    sum = 0;
                }
            }

            sb.append(total).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
