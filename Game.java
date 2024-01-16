import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random re = new Random();
        System.out.println("------------------------------- Number Guessing game in java --------------------------\n");

        int next = re.nextInt(100);
        System.out.println(next);

        System.out.println("--------------------- Computer Select the Random Number up to 100 ---------------------\n");
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.format("\n--------------------- \tWelcome To %s \t---------------------\n", name);
        System.out.println("\n--------------------- Now It's Your Turn to Guess the Number ---------------------\n");
        System.out.println(
                "\n:::::::::::::::::: Note :- We can give you Three Turn to guess the Number.If you failed then you loss the game ::::::::::::::::::");

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.printf(" Enter Your Number (Turn %d ): ", i);
                int num = sc.nextInt();

                if (next == num + 5 || next == num - 5 || next == num + 4 || next == num - 4 || next == num - 3
                        || next == num + 3 || next == num - 2 || next == num + 2 || next == num + 1
                        || next == num - 1) {
                    System.out.println("You're close! Keep going, you're getting warmer in your guesses!\n ");

                } else if (num >= next) {
                    if (num > next) {
                        System.out.println("The guessed number is higher than the computer's selected number.\n");
                        if(num > 100){
                            System.out.println("Invalid Input !!! Please Enter the number under the 100 ---- \n");
                            break;
                        }
                    } else {
                        System.out.format("Congratulations! %s have correctly guessed the number!\n", name);
                        break;
                    }
                } else if (num <= next) {
                    if (num < next) {
                        System.out.println("The guessed number is Less than the computer's selected number.\n");
                    } else {
                        System.out.format("Congratulations! %s have correctly guessed the number!\n", name);
                        break;
                    }
                } else if (num < 0) {

                    System.out.println(
                            "Oops! It seems there's been an error. Please enter a valid number greater than zero for your guess.\r\n");

                } else if (num != next) {
                    System.out.format("Sorry! %s you loss then Game !", name);
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.printf("Computer Selected Number is %d \n", next);
            System.out.println("Game Over. Thank you for playing!\r\n");
        }

    }
}
