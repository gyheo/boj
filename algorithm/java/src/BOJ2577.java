// from https://www.acmicpc.net/problem/2577

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2577 {
    static int A, B, C;
    static String result;
    static int[] digit = new int[10];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        result = String.valueOf(A * B * C);

        for (int i = 0, len = result.length(); i < len; i++) {
            char ch = result.charAt(i);
            digit[ch - '0']++;
        }

        for (int num : digit) {
            System.out.println(num);
        }
    }
}
