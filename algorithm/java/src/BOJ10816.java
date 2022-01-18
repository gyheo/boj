// problem : https://www.acmicpc.net/problem/10816

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10816 {
    static int M, N;
    static HashMap<Integer, Integer> hmap = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            int value = hmap.get(key) != null ? hmap.get(key) : 0;
            sb.append(value + " ");
        }

        System.out.println(sb);
    }
}