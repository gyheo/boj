// problem : https://www.acmicpc.net/problem/2739

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2739 {
    static int N;
    static int SIZE = 9;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= SIZE; i++) {
            sb.append(N).append(" * ").append(i).append(" = ").append(N * i).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
