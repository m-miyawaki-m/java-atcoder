import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        printCombinations(N);
    }

    private static void printCombinations(int N) {
        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N; y++) {
                for (int z = 0; z <= N; z++) {
                    if (x + y + z <= N) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }
}
