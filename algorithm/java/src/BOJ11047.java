// problem : https://www.acmicpc.net/problem/11047

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11047 {
    static int N, K;
    static ArrayList<Integer> coin = new ArrayList<>();
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int money = Integer.parseInt(br.readLine());
            coin.add(money);
        }

        for (int i = N - 1; i >= 0; i--) {
            answer += K / coin.get(i);
            K %= coin.get(i);
        }

        System.out.println(answer);
    }
}
