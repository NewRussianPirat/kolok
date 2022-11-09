import java.util.ArrayList;

public class Facade {
    public static int n;
    public static String str;

    public Facade(String str_1, int n_1) {
        str = str_1;
        n = n_1;
    }

    public static String Func() throws Exception {
        if (str.equals("Get Number")) {
            int a = FibonacciNumberCaller.Call(n);
            return "Number got";
        }
        else if (str.equals("Get Array")) {
            ArrayList<Integer> a = FibonacciArrayCaller.Call(n);
            return "Array got";
        }
        return null;
    }
}
