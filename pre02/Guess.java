import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args){
    //pick a random number - this activity is on page 47 exercise 3.4 Guess My Number//
    int line;
    int difference;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
  

    System.out.println("I'm thinking of a number between 1 and 100 (including both).");
    System.out.println("Can you guess what it is?");
    System.out.println("Type a number: ");
    line = in.nextInt();
    System.out.println("Your guess is: " + line);
    System.out.print("The number I was thinking of is: ");
    System.out.println(number);
    difference = line - number;
  
    System.out.println("You were off by: " + difference);






  }
}