// problem : https://www.acmicpc.net/problem/2908

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    static int A, B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String stringA = st.nextToken();
        String stringB = st.nextToken();

        A = reverse(stringA);
        B = reverse(stringB);

        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }

    private static int reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return Integer.parseInt(sb.toString());
    }
}
