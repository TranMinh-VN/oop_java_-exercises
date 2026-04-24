package part1_java_core.HAI_6E_20260122_135000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class JAVA_6E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.close();

        // Two monotonic deques
        // minDeque stores indices where values are increasing
        Deque<Integer> minDeque = new ArrayDeque<>();
        // maxDeque stores indices where values are decreasing
        Deque<Integer> maxDeque = new ArrayDeque<>();

        int maxLength = 0;
        List<int[]> intervals = new ArrayList<>();

        // Code here
    }
}

