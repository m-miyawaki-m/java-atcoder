import java.util.Scanner;

public class Main_bk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 材料の種類数
        int[] Q = new int[N]; // 各材料の量
        int[] A = new int[N]; // 料理Aに必要な材料の量
        int[] B = new int[N]; // 料理Bに必要な材料の量

        // 各材料の量を読み込む
        for (int i = 0; i < N; i++) {
            Q[i] = scanner.nextInt();
        }

        // 料理Aに必要な材料の量を読み込む
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 料理Bに必要な材料の量を読み込む
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        // 各材料で作れる料理の人数を計算
        long maxMealsA = Long.MAX_VALUE;
        long maxMealsB = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                maxMealsA = Math.min(maxMealsA, Q[i] / A[i]);
            }
            if (B[i] > 0) {
                maxMealsB = Math.min(maxMealsB, Q[i] / B[i]);
            }
        }

        // 合計で作れる最大人数を出力
        System.out.println(maxMealsA + maxMealsB);
        scanner.close();
    }
}
