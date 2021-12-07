import java.util.Scanner;

public class BOJ10950 {
    static int A, B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            A = sc.nextInt();
            B = sc.nextInt();
            sb.append(A + B).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
