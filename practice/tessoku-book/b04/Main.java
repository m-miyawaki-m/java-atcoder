import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binary = scanner.nextLine();

        // 2進数の文字列を10進数に変換
        int N = Integer.parseInt(binary, 2);
        System.out.println(N);

        scanner.close();
    }
}
