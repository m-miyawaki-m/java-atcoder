import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a と b を入力として受け取る
		int[] ary = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int result = ary[0] * ary[1];
		if (result % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");

		}
    }
}