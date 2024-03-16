import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < N; j++) {
                int edge = scanner.nextInt();
                if (edge == 1) {
                    if (output.length() > 0)
                        output.append(" ");
                    output.append(j + 1);
                }
            }
            System.out.println(output);
        }

        scanner.close();
    }
}
