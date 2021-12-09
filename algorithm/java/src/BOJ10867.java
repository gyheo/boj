import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10867 {
    static Set<Integer> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>(set); // set to list
        Collections.sort(list);
        
        for (int value : list) {
            sb.append(value).append(" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
