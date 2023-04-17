package Abstraction;
public class CalculatorTest {
    public static void main(String[] args) {
        int sum = Calculator.add(1, 2, 3, 4, 5);
        int difference = Calculator.subtract(10, 5, 2);
        int product = Calculator.multiply(2, 3, 4);
        
        System.out.println("Addition is: " + sum); 
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);     }
}


