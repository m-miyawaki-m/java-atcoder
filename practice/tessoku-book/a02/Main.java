import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.nextLine();  // 追加: 余分な改行文字を消費
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

        String result = "No";

        // method01
        int num = 0;
        num = method01(N, X, nums);
        if (num > 0) {
            result = "Yes";
        }

        //method02
        // if (method02(N, X, nums)) {
        //     result = "Yes";
        // }

        System.out.println(result);

        scanner.close();
    }
    public static int method01(int n, int x, int[] nums) {
        // System.out.println(Arrays.toString(nums));
        return (int)Arrays.stream(nums).filter(num -> num==x).count();
    }
    public static boolean method02(int n, int x, int[] nums) {
        return Arrays.stream(nums).anyMatch(num -> num==x);
    }
}
