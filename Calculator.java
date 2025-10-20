import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

   

        while (continueCalc) {
            System.out.println("\nChoose an operation:");
            System.out.println("1️⃣ Addition");
            System.out.println("2️⃣ Subtraction");
            System.out.println("3️⃣ Multiplication");
            System.out.println("4️⃣ Division");
            System.out.println("5️⃣ Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                continueCalc = false;
                System.out.println(" Thank you for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
