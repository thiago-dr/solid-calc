import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        char operationCh;
        Operation operation;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("1st Number: ");
            num1 = sc.nextDouble();

            System.out.print("Operation[+ - / *]: ");
            operationCh = sc.next().charAt(0);

            System.out.print("2nd Number: ");
            num2 = sc.nextDouble();
        }

        switch (operationCh) {
            case '+' -> operation = new Addition();
            case '-' -> operation = new Subtraction();
            case '/' -> operation = new Division();
            case '*' -> operation = new Multiplication();
            default -> throw new IllegalArgumentException("Invalid operation");
        }

        System.out.println("Result: " + Calculator.calculate(num1, num2, operation));
    }
}
