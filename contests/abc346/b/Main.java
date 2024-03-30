import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int b = scanner.nextInt();
        String t = "wbwbwwbwbwbw";

        for (int i = 0; i < t.length(); i++) {
            int nw = 0, nb = 0;
            for (int j = 0; j < w + b; j++) {
                if (t.charAt((i + j) % t.length()) == 'w')
                    nw++;
                else
                    nb++;
                if (nw > w || nb > b)
                    break;
                if (nw == w && nb == b) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}