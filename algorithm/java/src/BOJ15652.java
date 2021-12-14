// from https://www.acmicpc.net/problem/15652

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15652 {
    static int N, M;
    static int[] inputArr;
    static int[] outputArr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        inputArr = new int[N];
        for (int i = 0; i < N; i++) {
            inputArr[i] = i + 1;
        }

        outputArr = new int[N];

        combination(0, 0);
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void combination(int cnt, int start) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(outputArr[i]).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = start; i < N; i++) {
            outputArr[cnt] = inputArr[i];
            combination(cnt + 1, i);
        }
    }
}
