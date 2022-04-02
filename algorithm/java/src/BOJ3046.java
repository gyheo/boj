// problem : https://www.acmicpc.net/problem/3046

import java.util.Scanner;

public class BOJ3046 {
    static int R1, S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R1 = sc.nextInt();
        S = sc.nextInt();

        System.out.println(2 * S - R1);
    }
}
