import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] P = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            int person = scanner.nextInt();
            P[person] = i;
        }

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (P[A] < P[B]) {
                System.out.println(A);
            } else {
                System.out.println(B);
            }
        }

        scanner.close();
    }
}
