import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();  // 追加: 余分な改行文字を消費

        // Nを2進数に変換し、10桁で表示
        String binary = Integer.toBinaryString(N);
        String formattedBinary = String.format("%10s", binary).replace(' ', '0');
        System.out.println(formattedBinary);
        scanner.close();
    }
}
