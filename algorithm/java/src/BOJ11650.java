// problem : https://www.acmicpc.net/problem/11650

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11650 {
    static int N;
    static Point[] points;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        points = new Point[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(x, y);
        }

        Arrays.sort(points);

        for (Point p: points) {
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            int value = this.x - p.x;

            if (value == 0) {
                return this.y - p.y;
            }

            return value;
        }
    }
}
