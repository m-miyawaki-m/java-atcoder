import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] cumSum = new int[N];
        cumSum[0] = scanner.nextInt();
        
        for (int i = 1; i < N; i++) {
            cumSum[i] = cumSum[i - 1] + scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int L = scanner.nextInt() - 1;
            int R = scanner.nextInt() - 1;
            int rangeSum = (L == 0) ? cumSum[R] : cumSum[R] - cumSum[L - 1];
            System.out.println(rangeSum);
        }

        scanner.close();
    }
}
