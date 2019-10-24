package za.co.macbytes.coding.exercises;

public class SwapNumbersWithoutThirdVariable {
    
    public static void swapNumbers(int a, int b) {
        int x = a;
        int y = b;
        
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Numbers after swapping: a = " + x + ", b = " + y);
    }
    
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Numbers before swapping: a = " + a + ", b = " + b);
        SwapNumbersWithoutThirdVariable.swapNumbers(10, 20);
    }
}
