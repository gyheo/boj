// problem : https://www.acmicpc.net/problem/1152

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1152 {
    static String[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = br.readLine().split("");

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
                continue;
            }

            answer++;
        }

        System.out.println(answer);
    }
}
