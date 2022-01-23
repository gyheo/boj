// problem : https://www.acmicpc.net/problem/2558

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2558 {
    static int A, B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        System.out.println(A + B);
    }
}
