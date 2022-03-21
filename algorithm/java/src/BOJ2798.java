// problem : https://www.acmicpc.net/problem/2798

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2798 {
    static int N, M;
    static final int BLACKJACK_COUNT = 3;
    static int[] cards;
    static int[] combination = new int[BLACKJACK_COUNT];
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            cards[i] = value;
        }

        select(0, 0);

        System.out.println(answer);
    }

    private static void select(int count, int start) {
        if (count == BLACKJACK_COUNT) {
            int sum = 0;
            for (int i = 0; i < BLACKJACK_COUNT; i++) {
                sum += combination[i];
            }

            if (sum <= M && sum > answer) {
                answer = sum;
            }

            return;
        }

        for (int i = start; i < N; i++) {
            combination[count] = cards[i];
            select(count + 1, i + 1);
        }
    }
}
