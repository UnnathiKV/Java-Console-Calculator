import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Simple Java Console Calculator =====");
        while (true) {
            System.out.print("\nEnter First number: ");
            double num1 = input.nextDouble();
            System.out.print("Operator (+, -, *, /): ");
            char op = input.next().charAt(0);
            System.out.print("Enter Second number: ");
            double num2 = input.nextDouble();
            if (op == '+')
                System.out.println("Result: " + (num1 + num2));
            else if (op == '-')
                System.out.println("Result: " + (num1 - num2));
            else if (op == '*')
                System.out.println("Result: " + (num1 * num2));
            else if (op == '/') {
                if (num2 == 0)
                    System.out.println("Cannot divide by zero!");
                else
                    System.out.println("Result: " + (num1 / num2));
            } else
                System.out.println("Invalid operator!");
            System.out.print("Calculate again? (yes/no): ");
            if (input.next().equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }
        input.close();
    }
}
