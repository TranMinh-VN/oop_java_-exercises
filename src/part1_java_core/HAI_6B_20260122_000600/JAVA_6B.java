package part1_java_core.HAI_6B_20260122_000600;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JAVA_6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String cStr = scanner.next();
        char presidentColor = cStr.charAt(0);

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            grid[i] = line.toCharArray();
        }
        scanner.close();

        Set<Character> deputies = new HashSet<>();

        // Code here

        System.out.println(deputies.size());
    }
}

