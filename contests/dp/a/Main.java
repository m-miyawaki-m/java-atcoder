import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 足場の数
        int[] h = new int[N];
        Arrays.setAll(h, i -> scanner.nextInt());
        long result = frog1_dp1(N,h);
        System.out.println(result); // 足場Nに辿り着くまでの最小コスト
    }
    public static long frog1_dp1(int n,int[] h) {
        long result = 0;
        int[] dp = new int[n];
            dp[0] = 0; // 最初の足場にはコストなし
            Arrays.setAll(dp, i -> i == 0 ? 0 : Integer.MAX_VALUE);

            for (int i = 0; i < n; i++) {
                if (i + 1 < n) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(h[i] - h[i + 1]));
                }
                if (i + 2 < n) {
                    dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(h[i] - h[i + 2]));
                }
            }
            result = dp[n - 1];
        return result;
    }
}
