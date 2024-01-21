import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        Map<Integer, Integer> A = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            A.put(scanner.nextInt(), i);
        }

        int tmp = -1;
        for (int i = 0; i < N; i++) {
            tmp = A.get(tmp);
            System.out.print(tmp);
            if (i != N-1) System.out.print(" ");
        }
        System.out.println();
    }
}
