import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long cost = calculateCost(N);
        System.out.println(cost);
    }

    private static long calculateCost(long N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        if (N <= 1) {
            return 0;
        }
        long cost = N + calculateCost(N / 2) + calculateCost((N + 1) / 2);
        memo.put(N, cost);
        return cost;
    }
}