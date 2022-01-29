// https://www.acmicpc.net/problem/17219

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ17219 {
    static int N, M;
    static Map<String, String> hashMap = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String address = st.nextToken();
            String password = st.nextToken();

            hashMap.put(address, password);
        }

        for (int i = 0; i < M; i++) {
            String address = br.readLine();

            sb.append(hashMap.get(address)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
