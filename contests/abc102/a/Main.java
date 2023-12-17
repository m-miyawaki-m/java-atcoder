import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long result = 0;

        if (n % 2 == 0){
            result = n;
        } else {
            result = n * 2;
        }

        System.out.println(result);
        scanner.close();
    }
}
