import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong() - 1;
        String goodInteger = findGoodInteger(N);
        System.out.println(goodInteger);
        scanner.close();
    }

    private static String findGoodInteger(long N) {
        if (N == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (N > 0) {
            result.insert(0, 2 * (N % 5));
            N /= 5;
        }
        return result.toString();
    }
}