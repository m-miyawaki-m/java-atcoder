import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ctz = Integer.numberOfTrailingZeros(N);
        System.out.println(ctz);

        scanner.close();
    }
}
