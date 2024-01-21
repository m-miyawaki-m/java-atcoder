import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        
        int takahashiScore = 0;
        int aokiScore = 0;

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            takahashiScore += X;
            aokiScore += Y;
        }

        if (takahashiScore > aokiScore) {
            System.out.println("Takahashi");
        } else if (aokiScore > takahashiScore) {
            System.out.println("Aoki");
        } else {
            System.out.println("Draw");
        }

        scanner.close();
    }
}