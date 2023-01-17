public class OneFibonacciNumber {
    public int getNFibonacciNumber(int n) throws RuntimeException {
        if (n < 0) {
            throw new RuntimeException("Wrong N");
        }
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }
        else {
            int f1 = 1;
            int f2 = 1;
            for (int i = 3; i <= n; ++i) {
                int a = f2;
                f2 = f1 + f2;
                f1 = a;
            }
            return f2;
        }
    }
}
