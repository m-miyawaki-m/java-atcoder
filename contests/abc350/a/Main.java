import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        boolean isValidContest = false;

        if (S.startsWith("ABC")) {
            String numberPart = S.substring(3);
            int number = Integer.parseInt(numberPart);
            if ((number >= 1 && number <= 349) && number != 316) {
                isValidContest = true;
            }
        }

        if (isValidContest) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
