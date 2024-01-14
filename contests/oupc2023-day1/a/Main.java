import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();  // kotamanegi君の初期サイズ
        int T = scanner.nextInt();  // 目標とするピースの最大サイズ

        System.out.println(minimumCuts(A, T));
    }

    private static int minimumCuts(int A, int T) {
        int cuts = 0;

        while (A > T) {
            // 大きさがTより大きい場合、ピースを2つに分割
            int piecesNeeded = (A + T - 1) / T; // 分割後に必要なピースの総数
            int nextPieceSize = (A + piecesNeeded - 1) / piecesNeeded; // 次のピースのサイズ

            cuts += piecesNeeded - 1; // 現在のサイズで必要な切断回数
            A = nextPieceSize; // 次のステップでのピースサイズを更新
        }

        return cuts;
    }
}
