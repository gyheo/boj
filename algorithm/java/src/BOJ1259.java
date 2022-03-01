// problem : https://www.acmicpc.net/problem/1259

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.reverse;

public class BOJ1259 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        while (!inputString.equals("0")) {
            String[] strArr = inputString.split("");
            List<String> reversedString = new ArrayList<String>(Arrays.asList(strArr));
            reverse(reversedString);

            if (String.join("", reversedString).equals(inputString)) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");

            inputString = br.readLine();
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
