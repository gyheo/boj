// problem : https://www.acmicpc.net/problem/2562

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2562 {
    static int max = Integer.MIN_VALUE;
    static int maxIndex = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}
