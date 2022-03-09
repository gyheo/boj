// problem : https://www.acmicpc.net/problem/4153

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ4153 {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getList(br.readLine(), list);

        while (list.get(0) != 0 && list.get(1) != 0 && list.get(2) != 0) {
            if (Math.pow(list.get(2), 2) == Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2)) {
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append("\n");

            list.clear();
            getList(br.readLine(), list);
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void getList(String str, ArrayList<Integer> list) {
        StringTokenizer st = new StringTokenizer(str, " ");
        
        for (int i = 0; i < 3; i++) {
            int side = Integer.parseInt(st.nextToken());
            list.add(side);
        }
        Collections.sort(list);
    }
}
