
// Import Scanner 
import java.util.Scanner;

// Declare Class name
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Welcome Message
        System.out.println("Hii,\nWelcome to my calculator.!\n");

        // give first number from user
        System.out.println("Enter First Number :");
        int num1 = scanner.nextInt();

        // give second number from user
        System.out.println("Enter Second Number :");
        int num2 = scanner.nextInt();

        // make functions of given numbers
        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        float div = num1 / num2;

        // Make Menu option
        while (true) {
            System.out.println("\nChoose Number From 1 to 6:  ");
            System.out
                    .println(
                            "Addition : 1 \nSubtraction : 2 \nMultiplication : 3 \nDivision : 4\nAll : 5\n Exit : 6");
            int numb = scanner.nextInt();

            // For Addition : 1
            if (numb == 1) {
                System.out.println("Addition of " + num1 + " and " + num2 + " is " + add);
            }

            // For Subtraction : 2
            else if (numb == 2) {
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
            }

            // For Multiplication : 3
            else if (numb == 3) {
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multi);
            }

            // For Divition : 4
            else if (numb == 4) {
                if (num2 != 0) {
                    System.out.println("Divition of " + num1 + " and " + num2 + " is " + div);
                } else {
                    System.out.println("Divide from 0 is not possible");
                }
            }

            // For All in one :5
            else if (numb == 5) {
                System.out.println("Addition of " + num1 + " and " + num2 + " is " + add + "\nSubtraction of " + num1
                        + " and " + num2 + " is " + sub + "\nMultiplication of " + num1 + " and " + num2 + " is "
                        + multi
                        + "\nDivition of " + num1 + " and " + num2 + " is " + div);

                // For Break the Loop
            } else if (numb == 6) {
                System.out.println("Thanku For Visiting.....\nGood Bye !");
                break;

                // For Invaild choice
            } else {
                System.out.println("Invalid Number, Plz Choose Valid Number !");
            }
        }
    }
}
