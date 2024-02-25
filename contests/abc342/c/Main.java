import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void solve(BufferedReader br) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[] map = new int[26];
        for (int i = 0; i < 26; i++) {
            map[i] = i;
        }

        for (int qIndex = 0; qIndex < q; qIndex++) {
            String s1 = br.readLine();
            char c1 = s1.charAt(0);
            char c2 = s1.charAt(2);

            for (int i = 0; i < 26; i++) {
                if (map[i] == c1 - 'a') {
                    map[i] = c2 - 'a';
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append((char) (map[s.charAt(i) - 'a'] + 'a'));
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
    }
}