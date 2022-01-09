// problem : https://www.acmicpc.net/problem/11654

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11654 {
    static String str;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        System.out.println((int) str.charAt(0));
    }
}
