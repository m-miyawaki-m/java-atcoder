import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();  // 追加: 余分な改行文字を消費
        int[] nums_A = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

        boolean checkCards = checkSum(nums_A);
        String result = "No";
        if (checkCards) {
            result = "Yes";
        }

        System.out.println(result);

        scanner.close();
    }
    public static boolean checkSum(int[] nums_A) {
        for (int i=0; i<nums_A.length-2; i++) {
            for(int j=i+1; j<nums_A.length-1; j++) {
                for(int k=j+1; k<nums_A.length; k++) {
                    if (nums_A[i] + nums_A[j] + nums_A[k] == 1000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
