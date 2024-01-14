import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder dragonString = new StringBuilder("L");
        for (int i = 0; i < N; i++) {
            dragonString.append("o");
        }
        dragonString.append("ng");
        System.out.println(dragonString.toString());
        scanner.close();
    }
}
