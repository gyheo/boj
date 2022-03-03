// problem : https://www.acmicpc.net/problem/10989

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10989 {
    public static final int SIZE = 10001;
    public static int[] array = new int[SIZE];
    public static int N;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            int index = Integer.parseInt(br.readLine());

            array[index]++;
        }

        for (int i = 1; i < SIZE; i++) {
            for (int j = 0; j < array[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
