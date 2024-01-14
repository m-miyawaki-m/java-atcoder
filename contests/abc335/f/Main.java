import java.util.Scanner;

public class Main {
    private static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        long[] dp = new long[N + 1];
        dp[0] = 1;

        for (int i = 0; i < N; i++) {
            dp[i] %= MOD;
            for (int j = 1; i + j * A[i] < N; j++) {
                dp[i + j * A[i]] += dp[i];
                dp[i + j * A[i]] %= MOD;
            }
        }

        long result = 0;
        for (int i = 0; i <= N; i++) {
            result += dp[i];
            result %= MOD;
        }

        System.out.println(result);
    }
}