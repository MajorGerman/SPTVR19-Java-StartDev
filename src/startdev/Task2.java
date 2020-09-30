package startdev;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public void run(){
        System.out.println("\n----- Task №2 ------");
        
        System.out.println("~ Quessed number from 5 to 10 ~");
        
        Random rand = new Random();
        int quessed_number = rand.nextInt(10 - 5 + 1) + 5;
        
        System.out.print("Guess it: ");
        
        Scanner scan = new Scanner(System.in);
        int maybe_number = scan.nextInt();
        
        if (quessed_number == maybe_number) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose, quessed number was: " + quessed_number);
        }
        
        System.out.println("----- End of Task №2 ------");
    }
}
