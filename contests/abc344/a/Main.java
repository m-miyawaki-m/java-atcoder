import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int firstPipe = S.indexOf("|");
        int secondPipe = S.indexOf("|", firstPipe + 1);
        String result = S.substring(0, firstPipe) + S.substring(secondPipe + 1);
        System.out.println(result);
        scanner.close();
    }
}