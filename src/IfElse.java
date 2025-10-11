import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class IfElse
{
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter value of X :");
//        int x = scanner.nextInt();
//        System.out.println("Enter value of Y :");
//        int y = scanner.nextInt();
//
//        if (x == y) {
//            System.out.println("X and Y are equal.");
//        } else if (x > y) {
//            int z = x - y;
//            System.out.format("X is greater than Y by%d.", z);
//        } else {
//            int z = x - y;
//            System.out.format("Y is greater than X by %d", z);
//        }
        gammer();
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int chances = 2;
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        for (int z = 0; z <= chances; z++) {
            System.out.println("Guess a number between 1 and 6");
            int pickedNum = scanner.nextInt();
            if (randomNumber == pickedNum) {
                System.out.println("  Correct! You guessed it!");
            } else {
                System.out.println("  Wrong! Try again!");
            }
        }
    }

    public static void gammer() {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int randomNumber2 = ThreadLocalRandom.current().nextInt(1, 101);


        do {
            System.out.println("Guess a number between 1 and 100");
            guess = scanner.nextInt();
           if (randomNumber2 == guess) {
               System.out.println("Correct! You guessed it!");
           }else if (randomNumber2 < guess) {
               System.out.println("Try Higher");
           }else {
               System.out.println("Try Lower");
           }


        }while (randomNumber2 != guess);
    }

}
