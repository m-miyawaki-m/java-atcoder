import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String T = scanner.next();
        int N = scanner.nextInt();
        List<List<String>> bags = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            List<String> bag = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                bag.add(scanner.next());
            }
            bags.add(bag);
        }

        int[][] dp = new int[N + 1][T.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, (int) 1e9);
        }
        dp[0][0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= T.length(); j++) {
                dp[i + 1][j] = dp[i][j];
            }
            for (String s : bags.get(i)) {
                int sl = s.length();
                for (int j = 0; j + sl <= T.length(); j++) {
                    if (T.startsWith(s, j)) {
                        dp[i + 1][j + sl] = Math.min(dp[i + 1][j + sl], dp[i][j] + 1);
                    }
                }
            }
        }

        int result = dp[N][T.length()] > 5e8 ? -1 : dp[N][T.length()];
        System.out.println(result);

        scanner.close();
    }
}
