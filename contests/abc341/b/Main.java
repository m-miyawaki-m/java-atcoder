import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long[] S = new long[N-1], T = new long[N-1];
        for (int i = 0; i < N-1; i++) {
            S[i] = scanner.nextLong();
            T[i] = scanner.nextLong();
        }

        for (int i = 0; i < N-1; i++) {
            if (A[i] >= S[i]) {
                long exchanges = A[i] / S[i];
                A[i] -= exchanges * S[i];
                A[i+1] += exchanges * T[i];
            }
        }

        System.out.println(A[N-1]);
    }
}
