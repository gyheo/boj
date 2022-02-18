// problem : https://www.acmicpc.net/problem/2475

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2475 {
    static int answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String koiId[] = br.readLine().split(" ");

        int sum = 0;
        for (String id : koiId) {
            sum += Math.pow(Integer.parseInt(id), 2);
        }

        answer = sum % 10;
        System.out.println(answer);
    }
}
