import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int h = 1;
        while (h == 1) {
            Scanner scanner = new Scanner(System.in);
            int guess = 10;
            int number = randomNumber();
            System.out.println("Try to guess the number between 1 and 1000.");
            while (guess > 0) {
                System.out.println("You have " + guess + " guesses left.");
                double attempt = scanner.nextDouble();
                if (attempt < number) {
                    System.out.println("Have some confidence!! Aim higher!");
                }
                if (attempt == number) {
                    System.out.println("Congratulations! You win. Was it mathmatical genius? or just plain luck?");
                    break;
                }
                if (attempt > number) {
                    System.out.println("I appreciate your enthusiasm, but you're aiming too high!");

                }
                guess--;
            }
            if (guess == 0) {
                System.out.println("Game over! The answer was " + number);
            }
            System.out.println("Do you want to play again? (yes/no)");
            String replay = scanner.next();
            if (replay.equals("yes")) {
                h = 1;

            } else {
                System.out.println("Ok then, see you soon!!");
                h--;
            }
        }
    }

    public static int randomNumber() {
        return 1 + (int) (Math.random() * 1000);
    }
}
