public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println(facade.getNFibonacciNumber(5));
        System.out.println(facade.getFirstNFibonacciNumbers(5));
    }
}
