import java.util.ArrayList;

public class Fibonacci {
    static int Get_N_Fibonacci_Number(int n) throws Exception {
        if (n < 0) {
            throw new Exception();
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

    static ArrayList<Integer> Get_First_N_Fibonacci_Numbers (int n) throws Exception {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
                a.add(Get_N_Fibonacci_Number(i));
        }
        return a;
    }
}
