import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S1S2 = scanner.next();
        String T1T2 = scanner.next();
        boolean areSegmentsEqual = areSegmentsSameEdgeType(S1S2.charAt(0), S1S2.charAt(1), T1T2.charAt(0), T1T2.charAt(1));
        System.out.println(areSegmentsEqual ? "Yes" : "No");
        scanner.close();
    }

    private static boolean areSegmentsSameEdgeType(char S1, char S2, char T1, char T2) {
        String adjacent = "AB BC CD DE EA";
        String segmentS1S2 = "" + S1 + S2;
        boolean isS1S2Edge = adjacent.contains(segmentS1S2) || adjacent.contains(new StringBuilder(segmentS1S2).reverse().toString());
        String segmentT1T2 = "" + T1 + T2;
        boolean isT1T2Edge = adjacent.contains(segmentT1T2) || adjacent.contains(new StringBuilder(segmentT1T2).reverse().toString());
        return isS1S2Edge == isT1T2Edge;
    }
}
