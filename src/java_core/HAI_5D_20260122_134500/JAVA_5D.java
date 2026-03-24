package java_core.HAI_5D_20260122_134500;

import java.util.Scanner;
import java.util.Locale;

public class JAVA_5D {
    static double A, V_max_car;
    static double L_total, D_sign, W_limit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        if (!scanner.hasNextDouble()) return;

        A = scanner.nextDouble();
        V_max_car = scanner.nextDouble();
        L_total = scanner.nextDouble();
        D_sign = scanner.nextDouble();
        W_limit = scanner.nextDouble();
        scanner.close();

        double effective_w_at_d = Math.min(V_max_car, W_limit);

        double low = 0.0;
        double high = effective_w_at_d;

        for (int iter = 0; iter < 100; ++iter) {
            double m1 = low + (high - low) / 3.0;
            double m2 = high - (high - low) / 3.0;

            if (calculate_total_time_ts(m1) < calculate_total_time_ts(m2)) {
                high = m2;
            } else {
                low = m1;
            }
        }

        System.out.printf(Locale.US, "%.12f%n", calculate_total_time_ts(low));
    }

    static double calculate_total_time_ts(double v_at_d) {
        //
        return 0.0;
    }

    static double get_time_to_dist_with_target_end_speed(double dist, double u_start, double v_end, double v_max_car_local) {
        //
        return 0.0;
    }
}

