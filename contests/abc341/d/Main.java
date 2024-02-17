import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long K = scanner.nextLong();

        long left = 0, right = (long) 1e18;
        while (left < right) {
            long mid = (left + right) / 2;
            if (countLessEqual(mid, N, M) < K) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println(left);
        scanner.close();
    }

    private static long countLessEqual(long x, long N, long M) {
        return x / N + x / M - 2 * (x / lcm(N, M));
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
