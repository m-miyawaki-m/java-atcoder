import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        String[] parts = S.split("\\.");
        String lastPart = parts[parts.length - 1];

        System.out.println(lastPart);
        scanner.close();
    }
}
   