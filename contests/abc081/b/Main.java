import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N の値を読み込む
        int N = scanner.nextInt();
        int[] A = new int[N];

        // 整数の配列を読み込む
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        // 最大操作回数を計算
        int maxOperations = findMaxOperations(A);
        System.out.println(maxOperations);
    }

    private static int findMaxOperations(int[] A) {
        int minCount = Integer.MAX_VALUE;

        for (int number : A) {
            int count = 0;
            while (number % 2 == 0) {
                count++;
                number /= 2;
            }
            minCount = Math.min(minCount, count);
        }

        return minCount;
    }
}
