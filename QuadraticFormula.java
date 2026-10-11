import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thank you for using Formulas R Us");
        System.out.println("You have bought the Quadratric starter pack");
        System.out.println("Let's get you started. Enter your A value:");
        double a = scanner.nextDouble();
        System.out.println("Now enter your B value:");
        double b = scanner.nextDouble();
        System.out.println("And finally your C value:");
        double c = scanner.nextDouble();
        double discriminant = ((b * b) - (4 * a * c));
        if (discriminant > 0) {
            double value1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double value2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Your solutions are: " + value1 + " and " + value2
                    + " Thank you for using Formulas R Us! Please come by again for all your formula needs");
        }
        if (discriminant == 0) {
            double value0 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Your solution is: " + value0
                    + " Thank you for using Formulas R Us! Please come by again for all your formula needs");
        }
        if (discriminant < 0) {
            System.out.println(
                    "There are no real solutions. Thank you for using Formulas R Us! Please come by again for all your formula needs");
        }
    }
}
