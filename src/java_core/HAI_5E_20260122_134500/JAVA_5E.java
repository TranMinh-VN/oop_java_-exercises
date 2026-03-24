package java_core.HAI_5E_20260122_134500;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class JAVA_5E {
    static class Pair {
        int height;
        int count;

        Pair(int h, int c) {
            height = h;
            count = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                heights.add(scanner.nextInt());
            }
        }
        scanner.close();

        System.out.println(countVisiblePairs(heights));
    }

    static long countVisiblePairs(List<Integer> heights) {
        int n = heights.size();
        if (n <= 1) {
            return 0;
        }

        // Code here

        return 0; //totalVisiblePairs;
    }
}

