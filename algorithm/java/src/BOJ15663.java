// from https://www.acmicpc.net/problem/15663

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15663 {
    static int N, M;
    static boolean[] isSelected;
    static ArrayList<int[]> list = new ArrayList<>();
    static int[] input;
    static int[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        input = new int[N];
        output = new int[M];
        isSelected = new boolean[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);
        permutation(0);
        for (int i = 0; i < list.size(); i++) {
            int[] tmp = list.get(i);
            for (int j = 0; j < list.get(i).length; j++) {
                sb.append(tmp[j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void permutation(int cnt) {
        if (cnt == M) {
            int[] tmp = new int[M];
            for (int i = 0; i < M; i++) {
                tmp[i] = output[i];
            }

            for (int i = 0; i < list.size(); i++) {
                if (Arrays.equals(list.get(i), tmp)) {
                    return;
                }
            }

            if (!list.contains(tmp)) {
                list.add(tmp);
            }
            return;
        }

        for (int i = 0; i < input.length; i++) {
            if (isSelected[i]) continue;
            isSelected[i] = true;
            output[cnt] = input[i];
            permutation(cnt + 1);
            isSelected[i] = false;
        }

    }
}
