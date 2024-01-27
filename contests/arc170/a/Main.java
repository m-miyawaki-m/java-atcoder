import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 文字列の長さ N を入力
        String S = scanner.next();  // 文字列 S を入力
        String T = scanner.next();  // 文字列 T を入力

        int result = minimumOperationsToMatch(S, T);
        System.out.println(result);

        scanner.close();
    }

    private static int minimumOperationsToMatch(String S, String T) {
        int mismatchCount = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != T.charAt(i)) {
                mismatchCount++;
            }
        }

        // 奇数の場合は一致させることが不可能
        if (mismatchCount % 2 != 0) {
            return -1;
        }

        // 2つの異なる文字ごとに1回の操作が必要
        return mismatchCount / 2;
    }
}