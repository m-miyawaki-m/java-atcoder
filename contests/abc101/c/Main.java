import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N と K を入力として受け取る
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // 操作の最小回数を計算する
        // この計算は、(N - 1) / (K - 1) の切り上げに相当します
        int minOperations = (N - 1 + K - 2) / (K - 1);

        // 結果を出力する
        System.out.println(minOperations);
        scanner.close();
    }
}