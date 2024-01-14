import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(replaceLastCharacter(S));
    }

    private static String replaceLastCharacter(String S) {
        StringBuilder sb = new StringBuilder(S);
        sb.setCharAt(S.length() - 1, '4'); 
        return sb.toString();
    }
}
