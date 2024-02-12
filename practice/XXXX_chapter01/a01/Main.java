import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 文字列の長さ N を入力

        int result = (int)Math.pow(N,2);
        System.out.print(result);

        scanner.close();
    }
}