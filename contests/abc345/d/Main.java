import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N, H, W の入力を受け取る
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        // タイルの総面積
        int totalArea = 0;

        // タイルの情報を入力として受け取る
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            // タイルの面積を合計する
            totalArea += A * B;
        }

        // マス目の面積
        int gridArea = H * W;

        // タイルでマス目を覆えるかどうかを判定
        if (totalArea >= gridArea) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
