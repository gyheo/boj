// problem : https://www.acmicpc.net/problem/11720

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11720 {
    static int N;
    static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
