public class Power {

    public static double myPow(double x, int n) {
        if (n < 0) {
            return power(x, (long) n);
        }
        return power(x, (long) n);
    }

    public static double power(double x, long n) {

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
    }

    public static void main(String[] args) {
        // for (int i = 0; i <= 40; i++) {
        System.out.println(myPow(2, 10));
        // }
    }
}
