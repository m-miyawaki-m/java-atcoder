import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append("10");
        }
        sb.append("1");

        System.out.println(sb.toString());
    }
}
