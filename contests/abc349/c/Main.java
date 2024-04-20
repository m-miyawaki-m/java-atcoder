import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        List<String> list = new ArrayList<String>();
        boolean judge = true;
        T = T.toLowerCase();
        if (T.charAt(2) == 'x') {
            T = T.substring(0, 2);
        }

        for (int i = 0; i < T.length(); i++) {
            String sh = String.valueOf(T.charAt(i));
            list.add(sh);
        }

        for (String value : list) {
            if (S.contains(value)) {
                int index = S.indexOf(value);
                S = S.substring(index + 1, S.length());
            } else {
                judge = false;
                break;
            }
        }

        System.out.println(judge ? "Yes" : "No");

        sc.close();

    }

}
