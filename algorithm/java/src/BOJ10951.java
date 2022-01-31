// problem : https://www.acmicpc.net/problem/10951

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10951 {
    static int A, B;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String expression;

        while ((expression = br.readLine()) != null) {
            st = new StringTokenizer(expression, " ");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
