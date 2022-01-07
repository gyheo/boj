// problem : https://www.acmicpc.net/problem/1764

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1764 {
    static int N, M;
    static HashMap<String, Integer> hashMap = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            hashMap.put(name, 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (hashMap.containsKey(name)) {
                list.add(name);
            }
        }

        sb.append(list.size()).append("\n");
        Collections.sort(list); // 이름 순 정렬

        for (String name : list) {
            sb.append(name).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
