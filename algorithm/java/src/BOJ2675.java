// problem : https://www.acmicpc.net/problem/2675

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {
    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int cnt = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0, len = str.length(); j < len; j++) {
                for (int k = 0; k < cnt; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
