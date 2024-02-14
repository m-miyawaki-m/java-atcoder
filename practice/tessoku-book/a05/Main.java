import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int num = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int k = K - i - j;
                if (k >= 1 && k <= N) {
                    num++;
                }
            }
        }

        // 最終的な結果を出力
        System.out.println(num);
        scanner.close();
    }
}
