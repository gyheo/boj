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

            if (heightSum == HEIGHT_SUM) {
                Arrays.sort(output);
                for (int i = 0; i < OUTPUT_LENGTH; i++) {
                    System.out.println(output[i]);
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
