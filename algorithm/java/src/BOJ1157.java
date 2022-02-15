// problem : https://www.acmicpc.net/problem/1157

import java.util.Scanner;

public class BOJ1157 {
    static int[] alphabet;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toUpperCase();
        alphabet = new int[26];
        for (int i = 0, size = str.length(); i < size; i++) {
            alphabet[str.charAt(i) - 'A']++;
        }
        // System.out.println(Arrays.toString(alphabet));

        int max = Integer.MIN_VALUE, index = 0;
        boolean flag = false;
        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                index = i;
                flag = true;
            } else if (max == alphabet[i]) {
                flag = false;
            }
        }

        char result = Character.toUpperCase((char) (index + 'A'));

        if (!flag)
            result = '?';

        System.out.println(result);
    }
}