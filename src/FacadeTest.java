import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void getNFibonacciNumber() {
        Facade facade = new Facade();
        assertThrows(RuntimeException.class, () -> facade.getNFibonacciNumber(-1));
        assertEquals("0 fibonacci number is 0", facade.getNFibonacciNumber(0));
        assertEquals("1 fibonacci number is 1", facade.getNFibonacciNumber(1));
        assertEquals("2 fibonacci number is 1", facade.getNFibonacciNumber(2));
        assertEquals("6 fibonacci number is 8", facade.getNFibonacciNumber(6));
        assertEquals("22 fibonacci number is 17711", facade.getNFibonacciNumber(22));
        assertNotEquals("9 fibonacci number is 10", facade.getNFibonacciNumber(9));
    }

    @Test
    void getFirstNFibonacciNumbers() {
        Facade facade = new Facade();
        assertEquals("first 0 fibonacci numbers are ", facade.getFirstNFibonacciNumbers(-1));
        assertEquals("first 1 fibonacci numbers are 0 ", facade.getFirstNFibonacciNumbers(0));
        assertEquals("first 2 fibonacci numbers are 0 1 ", facade.getFirstNFibonacciNumbers(1));
        assertEquals("first 3 fibonacci numbers are 0 1 1 ", facade.getFirstNFibonacciNumbers(2));
        assertEquals("first 6 fibonacci numbers are 0 1 1 2 3 5 ", facade.getFirstNFibonacciNumbers(5));
    }
}