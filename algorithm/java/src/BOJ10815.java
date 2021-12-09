import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10815 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            hmap.put(key, hmap.getOrDefault(key, 0) + 1);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (hmap.get(key) != null) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
