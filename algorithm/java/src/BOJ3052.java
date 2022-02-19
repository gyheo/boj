// problem : https://www.acmicpc.net/problem/3052

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ3052 {
    static final int SIZE = 10;
    static HashSet<Integer> hashSet = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < SIZE; i++) {
            int num = Integer.parseInt(br.readLine());
            hashSet.add(num % 42);
        }

        System.out.println(hashSet.size());
    }
}
