import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < Q; i++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int x = scanner.nextInt();
                A.add(x);
            } else if (queryType == 2) {
                int k = scanner.nextInt();
                System.out.println(A.get(A.size() - k));
            }
        }

        scanner.close();
    }
}