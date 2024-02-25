import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Long, Integer> countMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long a = scanner.nextLong();
            long normalized = normalize(a);
            countMap.put(normalized, countMap.getOrDefault(normalized, 0) + 1);
        }

        long pairs = 0;
        for (int count : countMap.values()) {
            pairs += (long) count * (count - 1) / 2; // nC2 combinations
        }

        System.out.println(pairs);
    }

    private static long normalize(long a) {
        if (a == 0)
            return -1; // Handle 0 separately
        long value = 1;
        for (long p = 2; p * p <= a; p++) {
            while (a % p == 0) {
                value *= p;
                a /= p;
            }
        }
        if (a > 1)
            value *= a; // If a is a prime number
        return value;
    }
}