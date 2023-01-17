import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void getNFibonacciNumber() {
        OneFibonacciNumber oneFibonacciNumber = new OneFibonacciNumber();
        assertThrows(RuntimeException.class, () -> oneFibonacciNumber.getNFibonacciNumber(-1));
        assertEquals(0, oneFibonacciNumber.getNFibonacciNumber(0));
        assertEquals(1, oneFibonacciNumber.getNFibonacciNumber(1));
        assertEquals(1, oneFibonacciNumber.getNFibonacciNumber(2));
        assertEquals(8, oneFibonacciNumber.getNFibonacciNumber(6));
        assertEquals(17711, oneFibonacciNumber.getNFibonacciNumber(22));
        assertNotEquals(10, oneFibonacciNumber.getNFibonacciNumber(9));
    }

    @Test
    void getFirstNFibonacciNumbers() {
        ALotFibonacciNumbers aLotFibonacciNumbers = new ALotFibonacciNumbers();
        ArrayList<Integer> a = new ArrayList<>();
        assertEquals(a, aLotFibonacciNumbers.getFirstNFibonacciNumbers(-1));
        a.add(0);
        assertEquals(a, aLotFibonacciNumbers.getFirstNFibonacciNumbers(0));
        a.add(1);
        assertEquals(a, aLotFibonacciNumbers.getFirstNFibonacciNumbers(1));
        a.add(1);
        assertEquals(a, aLotFibonacciNumbers.getFirstNFibonacciNumbers(2));
        a.add(2);
        a.add(3);
        a.add(5);
        assertEquals(a, aLotFibonacciNumbers.getFirstNFibonacciNumbers(5));
        a.clear();
        assertNotEquals(a, aLotFibonacciNumbers.getFirstNFibonacciNumbers(10));
    }

    @Test
    void buildString() {
        BuildString buildString = new BuildString();
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals("", buildString.buildString(arrayList));
        arrayList.add(1);
        assertEquals("1 ", buildString.buildString(arrayList));
        arrayList.add(2);
        assertEquals("1 2 ", buildString.buildString(arrayList));
        arrayList.add(3);
        assertEquals("1 2 3 ", buildString.buildString(arrayList));
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        assertEquals("1 2 3 4 5 6 ", buildString.buildString(arrayList));
    }
}