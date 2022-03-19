// problem : https://www.acmicpc.net/problem/2309

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {
    static final int TOTAL = 9;
    static final int OUTPUT_LENGTH = 7;
    static final int HEIGHT_SUM = 100;

    static int[] dwarfHeight = new int[TOTAL];
    static int[] output = new int[OUTPUT_LENGTH];
    static boolean isAnswer = true; // 여러 정답 중 한 번만 출력할 수 있도록 조건 추가

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TOTAL; i++) {
            int height = Integer.parseInt(br.readLine());
            dwarfHeight[i] = height;
        }

        select(0, 0);
    }

    private static void select(int cnt, int start) {
        if (cnt == OUTPUT_LENGTH) {
            int heightSum = 0;

            for (int i = 0; i < OUTPUT_LENGTH; i++) {
                heightSum += output[i];
            }

            if (heightSum == HEIGHT_SUM && isAnswer) {
                isAnswer = false;

                Arrays.sort(output);
                for (int height : output) {
                    System.out.println(height);
                }
            }

            return;
        }

        for (int i = start; i < TOTAL; i++) {
            output[cnt] = dwarfHeight[i];
            select(cnt + 1, i + 1);
        }
    }
}
