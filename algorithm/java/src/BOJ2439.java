// problem : https://www.acmicpc.net/problem/2439

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2439 {
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                sb.append(" ");
            }

            for (int k = N; k >= i; k--) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}