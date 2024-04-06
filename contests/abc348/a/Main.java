import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                result.append("x");
            } else {
                result.append("o");
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}
