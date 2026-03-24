package java_core.HAI_6D_20260122_020000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JAVA_6D {
    static int n, a, b;
    static int minTotalShots = Integer.MAX_VALUE;
    static List<Integer> bestShots = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.close();

        solve(1, h, new ArrayList<>());

        System.out.println(minTotalShots);
        for (int i = 0; i < bestShots.size(); i++) {
            System.out.print((bestShots.get(i) + 1) + (i == bestShots.size() - 1 ? "" : " "));
        }
        System.out.println();
    }

    // idx is the current position we are considering shooting at (0-based index)
    // Valid shooting positions are 1 to n-2
    static void solve(int idx, int[] currentHp, List<Integer> currentShots) {
        // Code here
    }
}

