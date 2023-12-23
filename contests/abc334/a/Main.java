import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batPrice = scanner.nextInt();
        int glovePrice = scanner.nextInt();
        determineHigherPricedItem(batPrice, glovePrice);

        scanner.close();
    }

    public static void determineHigherPricedItem(int batPrice, int glovePrice) {
        String result;
        if (batPrice > glovePrice) {
            result = "Bat";
        } else {
            result = "Glove";
        }
        System.out.println(result);
    }
}
