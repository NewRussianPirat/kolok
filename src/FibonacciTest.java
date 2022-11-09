import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @org.junit.jupiter.api.Test
    void get_N_Fibonacci_Number() throws Exception {
        assertThrows(Exception.class, () -> { int a = Fibonacci.Get_N_Fibonacci_Number(-1); });
        assertEquals(0, Fibonacci.Get_N_Fibonacci_Number(0));
        assertEquals(1, Fibonacci.Get_N_Fibonacci_Number(1));
        assertEquals(1, Fibonacci.Get_N_Fibonacci_Number(2));
        assertEquals(8, Fibonacci.Get_N_Fibonacci_Number(6));
        assertEquals(17711, Fibonacci.Get_N_Fibonacci_Number(22));
        assertNotEquals(10, Fibonacci.Get_N_Fibonacci_Number(9));
    }

    @org.junit.jupiter.api.Test
    void get_First_N_Fibonacci_Numbers() throws Exception {
        ArrayList<Integer> a = new ArrayList<>();
        assertEquals(a, Fibonacci.Get_First_N_Fibonacci_Numbers(-1));
        a.add(0);
        assertEquals(a, Fibonacci.Get_First_N_Fibonacci_Numbers(0));
        a.add(1);
        assertEquals(a, Fibonacci.Get_First_N_Fibonacci_Numbers(1));
        a.add(1);
        assertEquals(a, Fibonacci.Get_First_N_Fibonacci_Numbers(2));
        a.add(2);
        a.add(3);
        a.add(5);
        assertEquals(a, Fibonacci.Get_First_N_Fibonacci_Numbers(5));
        a.clear();
        assertNotEquals(a, Fibonacci.Get_First_N_Fibonacci_Numbers(10));
    }

    int n;
}