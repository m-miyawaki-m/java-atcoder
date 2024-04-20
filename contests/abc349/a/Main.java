import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int totalPoints = 0;
        for (int i = 0; i < N - 1; i++) {
            totalPoints += scanner.nextInt();
        }

        int pointsForN = -totalPoints;
        System.out.println(pointsForN);

        scanner.close();
    }
}
