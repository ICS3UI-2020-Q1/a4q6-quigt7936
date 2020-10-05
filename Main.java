import java.util.Scanner;
/**
 * This program determines if the given number is prime
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get their number
    System.out.println("Which number would you like to check?");
    int userNumber = input.nextInt();

    // declare and initialize the variable that determines what number the program is on
    int numberOn = 2;

    // declare and initialize the primeRemainder variable
    int primeRemainder = userNumber % numberOn;

    // make a while look that performs as long as the prime remainder isn't 0 and the numberOn isn't the userNumber
    while (primeRemainder != 0 && userNumber != numberOn) {
      // declare and initialize the primeRemainder varaible
      primeRemainder = userNumber % numberOn;

      // add 1 to the number it's on and repeat the loop
      numberOn = numberOn + 1;
    }
    // tell them if their number is prime or not
    if (numberOn == userNumber) {
      System.out.println(userNumber + " is a prime number");
    } else {
      System.out.println(userNumber + " is not a prime number");
    }
  }
}
