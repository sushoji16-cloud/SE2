import java.util.Scanner;

public class minicalc {
    public static void main(String[] args) {

        System.out.println("MINI CALCULATOR");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        input.nextLine(); // clear buffer

        int c;

        System.out.println("Select operation\nadd\nsub\nmul\ndiv : ");
        String choice = input.nextLine();

        switch (choice) {
            case "add":
                c = a + b;
                System.out.println("Addition = " + c);
                break;

            case "sub":
                c = a - b;
                System.out.println("Difference = " + c);
                break;

            case "mul":
                c = a * b;
                System.out.println("Product = " + c);
                break;

            case "div":
                if (b != 0) {
                    c = a / b;
                    System.out.println("Quotient = " + c);
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

        input.close();
    }
}
