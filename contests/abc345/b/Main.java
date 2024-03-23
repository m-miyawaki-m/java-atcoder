import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong(); // 入力を long 型で受け取る

        // Xを10で割った結果を計算し、必要に応じて調整して切り上げる
        long result = X / 10;
        if (X > 0 && X % 10 != 0) {
            result++;
        }

        System.out.println(result);
        scanner.close();
    }
}