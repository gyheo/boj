// problem : https://www.acmicpc.net/problem/2667

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2667 {
    static int N;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> apt = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            char[] row = br.readLine().toCharArray();
            for (int j = 0; j < row.length; j++) {
                map[i][j] = row[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '1') {
                    search(i, j);
                }
            }
        }

        sb.append(apt.size()).append("\n");
        Collections.sort(apt);
        for (int size : apt) {
            sb.append(size).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void search(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        int count = 1;
        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX < 0 || newY < 0 || newX >= N || newY >= N || map[newX][newY] != '1') {
                    continue;
                }

                map[newX][newY] = '0';
                queue.offer(new Point(newX, newY));
                count++;
            }
        }

        if (count != 1) {
            count--; // 단지가 1개인 경우
        }

        apt.add(count);
    }

    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
