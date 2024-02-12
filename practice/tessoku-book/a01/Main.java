import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 文字列の長さ N を入力

        int result = method01(N);
        System.out.println(result);

        scanner.close();
    }
    public static int method01(int n) {
        return n * n;
    }
    public static int method02(int n) {
        return (int)Math.pow(n,2);
    }
    public static int method03(int n) {
        return n * n;
    }
    public static int method04(int n) {
        return n * n;
    }


}