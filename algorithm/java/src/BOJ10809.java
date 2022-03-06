// problem : https://www.acmicpc.net/problem/10809

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    static private String S;
    static private int[] alphabet = new int[26];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Arrays.fill(alphabet, -1);
        S = br.readLine().trim();

        for (int i = 0, size = S.length(); i < size; i++) {
            char ch = S.charAt(i);

            if (alphabet[ch - 'a'] == -1) {
                alphabet[ch - 'a'] = i;
            }
        }

        for (int i = 0, size = alphabet.length; i < size; i++) {
            sb.append(alphabet[i]).append(" ");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
