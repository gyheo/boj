// problem : https://www.acmicpc.net/problem/2751

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2751 {
    static int N;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }
        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            sb.append(list.get(i)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
