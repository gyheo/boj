import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {
    static int N;
    static double[] score;
    static double max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        score = new double[N];

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());

            if (max < score[i]) {
                max = score[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = score[i] / max * 100;

            sum += score[i];
        }

        System.out.println(sum / N);
    }
}
