// from https://www.acmicpc.net/problem/15664

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15664 {
    static int N, M;
    static int[] input;
    static ArrayList<int[]> outputList = new ArrayList<>();
    static int[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        output = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        combination(0, 0);

        for (int[] tmp : outputList) {
            for (int i = 0; i < M; i++) {
                sb.append(tmp[i]).append(" ");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void combination(int cnt, int start) {
        if (cnt == M) {
            int[] tmp = new int[M];
            for (int i = 0; i < M; i++) {
                tmp[i] = output[i];
            }

            for (int i = 0, size = outputList.size(); i < size; i++) {
                if (Arrays.equals(tmp, outputList.get(i))) {
                    return;
                }
            }
            outputList.add(tmp);

            return;
        }

        for (int i = start; i < N; i++) {
            output[cnt] = input[i];
            combination(cnt + 1, i + 1);
        }
    }
}
