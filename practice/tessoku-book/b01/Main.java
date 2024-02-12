import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();  // 文字列の長さ N を入力
        int B = scanner.nextInt();  // 文字列の長さ N を入力

        int result = plus(A, B);
        System.out.print(result);

        scanner.close();
    }
    public static int plus(int a, int b) {
        return a + b;
    }
}