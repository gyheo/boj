// from https://www.acmicpc.net/submit/15655

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ15655 {
    static int N, M;
    static ArrayList<Integer> inputList = new ArrayList<>();
    static ArrayList<Integer> outputList = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            inputList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(inputList);

        combination(0, 0);
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void combination(int cnt, int start) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(outputList.get(i)).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = start; i < N; i++) {
            outputList.add(cnt, inputList.get(i));
            combination(cnt + 1, i + 1);
            outputList.remove(cnt);
        }
    }
}
