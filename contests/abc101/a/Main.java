package contests.abc101.a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 文字列 S を入力として受け取る
        String s = scanner.next();

        // 初期値を設定
        int result = 0;

        // 文字列の各文字を順に処理
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+') {
                result++;
            } else if (c == '-') {
                result--;
            }
        }

        // 最終的な結果を出力
        System.out.println(result);
    }
}