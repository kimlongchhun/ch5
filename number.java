import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int lives = 3;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;

        System.out.print("Guess my number: ");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Correct!");
        } else {
            lives = lives - 1;
            System.out.println("Wrong!");
            System.out.println("You have " + lives + " left.");
            System.out.println("The number was " + number);
        }

        scanner.close();
    }
}

