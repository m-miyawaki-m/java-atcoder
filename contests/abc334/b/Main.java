import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong(); // 基点の座標
        long M = scanner.nextLong(); // ツリー間の距離
        long L = scanner.nextLong(); // 高橋君の位置
        long R = scanner.nextLong(); // 青木君の位置

        // L以上R以下にある最初のツリーの位置を計算
        long firstTreePosition = ((L - A + M - 1) / M) * M + A;
        if (firstTreePosition < L) {
            firstTreePosition += M;
        }

        // L以上R以下にある最後のツリーの位置を計算
        long lastTreePosition = ((R - A) / M) * M + A;

        // ツリーの本数を計算
        long totalTrees = 0;
        if (firstTreePosition <= R) {
            totalTrees = (lastTreePosition - firstTreePosition) / M + 1;
        }

        System.out.println(totalTrees);
        scanner.close();
    }
}
