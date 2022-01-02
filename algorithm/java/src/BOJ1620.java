// https://www.acmicpc.net/problem/1620

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {
    static int N, M;
    static HashMap<String, Integer> pokemonToNumHashMap = new HashMap<>();
    static HashMap<Integer, String> numToPokemonHashMap = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            pokemonToNumHashMap.put(pokemon, i);
            numToPokemonHashMap.put(i, pokemon);
        }

        for (int i = 0; i < M; i++) {
            String pokemon = br.readLine();
            char ch = pokemon.charAt(0);

            if (Character.isDigit(ch)) {
                sb.append(numToPokemonHashMap.get(Integer.parseInt(pokemon)));
            } else {
                sb.append(pokemonToNumHashMap.get(pokemon));
            }
            sb.append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
