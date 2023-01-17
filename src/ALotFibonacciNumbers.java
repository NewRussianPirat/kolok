import java.util.ArrayList;

public class ALotFibonacciNumbers {
    OneFibonacciNumber oneFibonacciNumber = new OneFibonacciNumber();

    public ArrayList<Integer> getFirstNFibonacciNumbers(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            a.add(oneFibonacciNumber.getNFibonacciNumber(i));
        }
        return a;
    }
}
