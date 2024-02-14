import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();  // 文字列の長さ N を入力
        int B = scanner.nextInt();  // 文字列の長さ N を入力

        int result = method02(A, B);
        System.out.println(result);

        scanner.close();
    }
    public static int method01(int a, int b) {
        return a + b;
    }
    public static int method02(int a, int b) {
        BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;
        int result = plus.apply(a, b);
        return result;
    }
}