import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        ArrayList<int[]> positions = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            positions.add(new int[] {i, 0});
        }

        for (int q = 0; q < Q; q++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                char direction = scanner.next().charAt(0);
                moveHead(positions, direction);
            } else if (queryType == 2) {
                int p = scanner.nextInt();
                System.out.println(getCoordinates(positions, p));
            }
        }
    }

    private static void moveHead(ArrayList<int[]> positions, char direction) {
        int[] newHead = positions.get(0).clone();

        switch (direction) {
            case 'R': newHead[0]++; break;
            case 'L': newHead[0]--; break;
            case 'U': newHead[1]++; break;
            case 'D': newHead[1]--; break;
        }

        positions.remove(positions.size() - 1);
        positions.add(0, newHead);
    }

    private static String getCoordinates(ArrayList<int[]> positions, int p) {
        int[] pos = positions.get(p - 1);
        return pos[0] + " " + pos[1];
    }
}
