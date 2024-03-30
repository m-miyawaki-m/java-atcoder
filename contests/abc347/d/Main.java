import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long C = scanner.nextLong();

        if (C == 0) {
            if (a == b) {
                System.out.println("0 0");
            } else {
                System.out.println("-1");
            }
        } else {
            long X = 0, Y = 0;

            // Cのビットを右から左に走査し、XとYに適切に分配する
            for (int i = 59; i >= 0; i--) {
                long bit = 1L << i;
                if ((C & bit) != 0) {
                    if (a > b) {
                        X |= bit;
                        a--;
                    } else {
                        Y |= bit;
                        b--;
                    }
                }
            }

            // popcountを満たすために残りのビットをXとYに割り当てる
            for (int i = 59; i >= 0; i--) {
                long bit = 1L << i;
                if (a > 0 && (X & bit) == 0) {
                    X |= bit;
                    a--;
                } else if (b > 0 && (Y & bit) == 0) {
                    Y |= bit;
                    b--;
                }
            }

            if (a == 0 && b == 0) {
                System.out.println(X + " " + Y);
            } else {
                System.out.println("-1");
            }
        }

        scanner.close();
    }
}