// from https://www.acmicpc.net/problem/15651

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15651 {
    static int N, M;
    static int[] input;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        input = new int[N];
        result = new int[M];

        for (int i = 0; i < N; i++) {
            input[i] = i + 1;
        }

        permutation(0);
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void permutation(int cnt) {
        if (cnt == M) {
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            result[cnt] = input[i];
            permutation(cnt + 1);
        }
    }
}
