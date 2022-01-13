// problem : https://www.acmicpc.net/problem/2750

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2750 {
    static int N;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);
        for (int num : arr) {
            sb.append(num).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
