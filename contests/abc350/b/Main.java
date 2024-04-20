import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        
        boolean[] teeth = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            teeth[i] = true;
        }
        
        for (int i = 0; i < Q; i++) {
            int T = scanner.nextInt() - 1;
            teeth[T] = !teeth[T];
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (teeth[i]) {
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}
