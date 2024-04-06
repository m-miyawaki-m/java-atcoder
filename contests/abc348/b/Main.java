import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            double maxDistance = -1;
            int furthestPointIndex = -1;
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;

                double distance = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));

                if (distance > maxDistance) {
                    maxDistance = distance;
                    furthestPointIndex = j;
                }
            }
            System.out.println(furthestPointIndex + 1);
        }

        scanner.close();
    }
}
