package java_core.HAI_6C_20260122_015500;

import java.util.Scanner;

public class JAVA_6C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        scanner.close();

        // Code here
    }
}

