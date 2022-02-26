// problem : https://www.acmicpc.net/problem/2920

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2920 {
    private static final int SIZE = 8;
    private static int[] arr = new int[SIZE];
    private static int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
    private static int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        for (int i = 0; i < SIZE; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        if (Arrays.equals(arr, asc)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, desc)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
