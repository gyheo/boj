// problem : https://www.acmicpc.net/problem/11399

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ11399 {
    static int N;
    static ArrayList<Integer> list = new ArrayList();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                answer += list.get(j);
            }
        }

        System.out.println(answer);
    }
}
