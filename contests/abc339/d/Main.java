import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 改行を読み飛ばし

        int[] player1 = new int[2];
        int[] player2 = new int[2];
        boolean foundFirstPlayer = false;

        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                if (row.charAt(j) == 'P') {
                    if (!foundFirstPlayer) {
                        player1[0] = i;
                        player1[1] = j;
                        foundFirstPlayer = true;
                    } else {
                        player2[0] = i;
                        player2[1] = j;
                    }
                }
            }
        }

        int distance = Math.abs(player1[0] - player2[0]) + Math.abs(player1[1] - player2[1]);

        System.out.println(distance);
    }
}