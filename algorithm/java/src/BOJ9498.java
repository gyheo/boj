// https://www.acmicpc.net/problem/9498

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9498 {
    public static int score;
    public static String answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        score = Integer.parseInt(br.readLine());

        if (score >= 90) {
            answer = "A";
        } else if (score >= 80) {
            answer = "B";
        } else if (score >= 70) {
            answer = "C";
        } else if (score >= 60) {
            answer = "D";
        } else {
            answer = "F";
        }

        System.out.println(answer);
    }
}