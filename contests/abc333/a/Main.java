import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // generateRepeatedNumberWithLoop(N);
        generateRepeatedNumberWithStream(N);
        scanner.close();
    }
    
    public static void generateRepeatedNumberWithLoop(int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(n);
        }
        System.out.println(result.toString());
    }
    
    public static void generateRepeatedNumberWithStream(int n){
        String result = IntStream.range(0, n)
                                 .mapToObj(i -> String.valueOf(n))
                                 .reduce("", String::concat);
        System.out.println(result);
    }
}