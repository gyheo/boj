// problem : https://www.acmicpc.net/problem/2438

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2438 {
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
