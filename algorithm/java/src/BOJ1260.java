// from https://www.acmicpc.net/problem/1260

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1260 {
    static int N, M, V;
    static boolean[][] adjMatrix;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adjMatrix = new boolean[N + 1][N + 1]; // 1부터 시작

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            adjMatrix[from][to] = adjMatrix[to][from] = true;

        }

        boolean[] visited = new boolean[N + 1];
        dfs(V, visited);
        sb.append("\n");
        bfs();
        System.out.println(sb);
    }

    private static void dfs(int vertex, boolean[] visited) {
        sb.append(vertex + " ");
        visited[vertex] = true;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && adjMatrix[vertex][i]) {
                visited[i] = true;
                dfs(i, visited);
            }
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];

        queue.offer(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current + " ");
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && adjMatrix[current][i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}