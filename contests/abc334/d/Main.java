import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // ソリの数
        int Q = scanner.nextInt(); // クエリの数

        long[] reindeersRequired = new long[N];
        for (int i = 0; i < N; i++) {
            reindeersRequired[i] = scanner.nextLong();
        }

        // ソリを必要なトナカイの数で一度だけソート
        Arrays.sort(reindeersRequired);

        // 累積和を計算
        long[] cumSum = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            cumSum[i] = cumSum[i - 1] + reindeersRequired[i - 1];
        }

        // 各クエリに対する答えを計算
        for (int q = 0; q < Q; q++) {
            long X = scanner.nextLong(); // トナカイの数

            // 累積和を使って引けるソリの最大数を見つける
            int answer = Arrays.binarySearch(cumSum, X);
            if (answer < 0) {
                answer = -answer - 2; // 累積和がXより小さい最大のインデックスを見つける
            }

            System.out.println(answer);
        }
    }
}