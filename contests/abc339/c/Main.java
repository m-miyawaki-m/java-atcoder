import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long currentPassengers = IntStream.range(0, N)
        .mapToLong(i -> scanner.nextLong())
        .reduce(0, (total, change) -> {
            long newTotal = total + change;
            return newTotal < 0 ? 0 : newTotal;
        });
        System.out.println(currentPassengers);
    }
}

