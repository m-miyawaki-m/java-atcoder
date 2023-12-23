import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt(); // ソリの数
            int Q = scanner.nextInt(); // クエリの数

            int[] reindeersRequired = new int[N];
            for (int i = 0; i < N; i++) {
                reindeersRequired[i] = scanner.nextInt();
            }

            // ソリを必要なトナカイの数でソート
            Arrays.sort(reindeersRequired);

            // 各クエリに対する答えを計算
            for (int q = 0; q < Q; q++) {
                long X = scanner.nextLong(); // トナカイの数
                int count = 0; // 引けるソリの数

                for (int i = 0; i < N; i++) {
                    if (X >= reindeersRequired[i]) {
                        X -= reindeersRequired[i];
                        count++;
                    } else {
                        break;
                    }
                }

                System.out.println(count);
            }
        }
    }
}