import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 文字列 S を入力として受け取る
        String[] strings = scanner.next().split("");

        // stream を使って文字列の各文字を順に処理
        long num = Arrays.stream(strings).filter(s -> s.equals("1")).count();

        // 最終的な結果を出力
        System.out.println(num);
        scanner.close();
    }
}
