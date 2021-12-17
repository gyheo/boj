// from https://www.acmicpc.net/submit/15656

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15656 {
    static int N, M;
    static int[] inputArray, outputArray;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        inputArray = new int[N];
        outputArray = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            inputArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputArray);
        permutation(0);
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void permutation(int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(outputArray[i]).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = 0; i < N; i++) {
            outputArray[cnt] = inputArray[i];
            permutation(cnt + 1);
        }
    }
}
