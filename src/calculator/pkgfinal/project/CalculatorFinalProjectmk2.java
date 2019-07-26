package calculator.pkgfinal.project;
import java.util.Scanner;

public class CalculatorFinalProjectmk2 {
 
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type your first number");
        Double num1 = keyboard.nextDouble();
        System.out.println("Please type your second number");
        Double num2 = keyboard.nextDouble();
        System.out.println("Please type the function you wish to execute, add, "
                + "minus, multiply, divide, xPowerOfy, or reset");
        String operation = keyboard.nextLine();
        System.out.println("The answer is ...");
}  
    
    public static enum simpleMathOperations {
            normal, add, minus, multiply, divide, xPowerOfy;
        }
    
    
        public static Double num1, num2;
        public static simpleMathOperations operation = simpleMathOperations.normal;
        public static Double simpleMathOperations() {
            if (operation.equals(simpleMathOperations.normal)) {
                return num2;
            }
            if (operation == simpleMathOperations.add) {
                return num1 + num2;
            }
            if (operation == simpleMathOperations.minus) {
                return num1 - num2;
            }
            if (operation == simpleMathOperations.multiply) {
                return num1 * num2;
            }
            if (operation == simpleMathOperations.divide) {
                return num1 / num2;
            }
            if (operation == simpleMathOperations.xPowerOfy) {
                return Math.pow(num1,num2);
            }
            throw new Error();
        }
        public Double reset() {
        num1 = 0.0;
        num2 = 0.0;
        
        return Double.NaN;
        }        

}