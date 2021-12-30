// from https://www.acmicpc.net/problem/17471

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17471 {
    static int N, population[];
    static boolean[][] adjMatrix;
    static boolean[] isSelected;
    static int totalPopulation = 0;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        population = new int[N + 1];
        adjMatrix = new boolean[N + 1][N + 1];
        isSelected = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            population[i] = Integer.parseInt(st.nextToken());
            totalPopulation += population[i];
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int adjCnt = Integer.parseInt(st.nextToken());

            for (int j = 0; j < adjCnt; j++) {
                int from = i;
                int to = Integer.parseInt(st.nextToken());

                adjMatrix[from][to] = true;
            }
        } // input

        divide(1, 0); // logic
        System.out.println(min == Integer.MAX_VALUE ? -1 : min); // output
    }

    // 부분집합의 T, F로 2구역을 나눈 뒤 dfs로 방문하면서 그룹이 정상적인지 확인
    private static void divide(int cnt, int total) {
        if (cnt == N + 1) {
            if (total == totalPopulation || total == 0) {
                return;
            }

            boolean[] visited = new boolean[N + 1];

            int blackStart = 0, whiteStart = 0;
            for (int i = 1; i <= N; i++) {
                if (isSelected[i]) {
                    blackStart = i;
                    break;
                }
            }

            for (int i = 1; i <= N; i++) {
                if (!isSelected[i]) {
                    whiteStart = i;
                    break;
                }
            }

            dfs(blackStart, visited);
            dfs(whiteStart, visited);

            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    return;
                }
            }

            int otherSum = 0;
            for (int i = 1; i <= N; i++) {
                if (!isSelected[i]) {
                    otherSum += population[i];
                }
            }

            min = Math.min(Math.abs(total - otherSum), min);
            return;
        }

        isSelected[cnt] = true;
        divide(cnt + 1, total + population[cnt]);
        isSelected[cnt] = false;
        divide(cnt + 1, total);
    }

    private static void dfs(int start, boolean[] visited) {
        visited[start] = true;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && adjMatrix[start][i] && isSelected[start] == isSelected[i]) {
                dfs(i, visited);
            }
        }
    }
}