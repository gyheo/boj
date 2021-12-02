import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ3040 {
    static int N = 9;
    static final int TOTAL = 100;
    static int[] dwarf = new int[N];
    static int[] select = new int[7];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(br.readLine());
            dwarf[i] = height;
        }

        combination(0, 0);
    }

    private static void combination(int start, int cnt) {
        if (cnt == 7) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += select[i];
            }

            if (sum == TOTAL) {
                for (int height : select) {
                    System.out.println(height);
                }
            }

            return;
        }
        for (int i = start; i < N; i++) {
            select[cnt] = dwarf[i];
            combination(i + 1, cnt + 1);
        }
    }
}
