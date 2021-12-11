// from https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class BOJ2108 {
    static int[] list;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        list = new int[N];

        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            list[i] = num;
            sum += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();

        int maxValue = Integer.MIN_VALUE;

        ArrayList<Integer> cntList = new ArrayList<>();

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // 최빈값이랑 같은 key값 찾기
        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value >= maxValue) {
                cntList.add(key);
            }
        }

        Collections.sort(cntList);

        int cnt = 0;
        if (cntList.size() < 2) {
            cnt = cntList.get(0);
        } else {
            cnt = cntList.get(1);
        }

        sb.append(Math.round(sum / N)).append("\n")
                .append(list[N / 2]).append("\n")
                .append(cnt).append("\n")
                .append(Math.abs(list[N - 1] - list[0])).append("\n");

        System.out.println(sb);
    }
}
