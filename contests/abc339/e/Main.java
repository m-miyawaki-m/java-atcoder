import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int maxLength = 1; // 部分列の最大長を保持する変数。最小でも1
        int currentLength = 1; // 現在調べている部分列の長さ

        for (int i = 1; i < N; i++) {
            // 隣接する2項の差の絶対値がD以下の場合、部分列を拡張
            if (Math.abs(A[i] - A[i - 1]) <= D) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength); // 最大長を更新
            } else {
                // 条件を満たさない場合は、新しい部分列の開始
                currentLength = 1;
            }
        }

        System.out.println(maxLength);
    }
}
