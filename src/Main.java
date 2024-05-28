import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            char operator = getValidOperator(scanner);

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // result
            double result = performOperation(num1, num2, operator);
            System.out.println("Your result is: " + result);

            System.out.println("Do you want to continue calculation? (Y / N)");
            String cont = scanner.next();

            if (cont.equals("N") || cont.equals("n"))
            {
                break;
            }
        }
        scanner.close();
        }

        public static char getValidOperator(Scanner scanner)
        {
            char operator;
            while(true){
                System.out.println("Enter the operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                    break;
                }
                else {
                    System.out.println("Invalid operator! Try again.");
                }
            }
            return operator;
        }


        // performOperation function
        public static double performOperation(double n1, double n2, char opt)
        {
            switch (opt){
                case '+':
                    return add(n1, n2);
                case '-':
                    return subtract(n1, n2);
                case '*':
                    return multiply(n1, n2);
                case '/':
                    return division(n1, n2);
                default:
                    System.out.println("Invalid operation");
                    return 0;
            }
        }

        public static double add(double a, double b)
        {
            return a + b;
        }

        public static double subtract(double a, double b)
        {
            return a - b;
        }

        public static double multiply(double a, double b)
        {
            return a * b;
        }

        public static double division(double a, double b)
        {
            if(b == 0)
            {
                System.out.println("Division by zero not possible");
                return 0;
            }
            else
            {
                return a / b;
            }
        }
}