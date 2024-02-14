import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();  // 追加: 余分な改行文字を消費
        int[] nums_p = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

        int[] nums_q = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

        boolean checkCards = checkSum(K, nums_p, nums_q);
        String result = "No";
        if (checkCards) {
            result = "Yes";
        }

        System.out.println(result);

        scanner.close();
    }
    public static boolean checkSum(int K, int[] nums_p, int[] nums_q) {
        for (int num_p : nums_p) {
            for (int num_q : nums_q) {
                if (num_p + num_q == K) {
                    return true;
                }
            }
        }
        return false;
    }
}
