import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 標準入力から a と b を読み込む
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // 結果をチェックして出力
        if (isSquareNumber(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isSquareNumber(int a, int b) {
        // a と b を結合して新しい数を形成
        long combinedNumber = Long.parseLong(a + "" + b);

        // 結合した数の平方根を求める
        long sqrt = (long) Math.sqrt(combinedNumber);

        // 平方根の二乗が元の数と等しいかを確認
        return sqrt * sqrt == combinedNumber;
    }
}