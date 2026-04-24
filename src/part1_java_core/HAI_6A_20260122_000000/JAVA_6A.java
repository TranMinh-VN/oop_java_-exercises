package part1_java_core.HAI_6A_20260122_000000;

import java.util.Scanner;

public class JAVA_6A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sticks = new int[4];

        // Read 4 integers
        for (int i = 0; i < 4; i++) {
            if (scanner.hasNextInt()) {
                sticks[i] = scanner.nextInt();
            }
        }
        scanner.close();

        boolean segmentFound = false;

        // Code here

        if (segmentFound) {
            System.out.println("SEGMENT");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}

