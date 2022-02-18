// problem : https://www.acmicpc.net/problem/1157

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ1157 {
    static int[] alphabet;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase();
        alphabet = new int[26];
        for (int i = 0, size = str.length(); i < size; i++) {
            alphabet[str.charAt(i) - 'A']++;
        }
        // System.out.println(Arrays.toString(alphabet));

        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < alphabet.length; i++) {
            if (maxValue < alphabet[i]) {
                maxValue = alphabet[i];
                maxIndex = i;
            }
        }

        char result = (char)('A' + maxIndex);

        for (int i = 0; i < alphabet.length; i++) {
            if (i != maxIndex && maxValue <= alphabet[i]) {
                result = '?';
                break;
            }
        }

        System.out.println(result);
    }
}