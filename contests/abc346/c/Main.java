import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long total = (long) K * (K + 1) / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if (A <= K && set.add(A)) {
                total -= A;
            }
        }

        // 最終的な合計を出力
        System.out.println(total);

        scanner.close();
    }
}