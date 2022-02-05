// problem : https://www.acmicpc.net/problem/2741

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2741 {
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sb.append(i).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
