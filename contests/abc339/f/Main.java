import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger[] A = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = new BigInteger(scanner.next());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                BigInteger product = A[i].multiply(A[j]);
                for (int k = 0; k < N; k++) {
                    if (product.equals(A[k])) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
