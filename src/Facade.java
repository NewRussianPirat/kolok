import java.util.ArrayList;

public class Facade {

    OneFibonacciNumber oneFibonacciNumber = new OneFibonacciNumber();
    ALotFibonacciNumbers aLotFibonacciNumbers = new ALotFibonacciNumbers();
    BuildString buildString = new BuildString();

    public String getNFibonacciNumber(int n) {
        return n + " fibonacci number is " + oneFibonacciNumber.getNFibonacciNumber(n);
    }

    public String getFirstNFibonacciNumbers(int n) {
        ArrayList<Integer> arrayList = aLotFibonacciNumbers.getFirstNFibonacciNumbers(n);
        return "first " + (n + 1) + " fibonacci numbers are " + buildString.buildString(arrayList);
    }
}
