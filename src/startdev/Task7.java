package startdev;

import java.util.Scanner;

public class Task7 {
    public void run(){
        System.out.println("\n----- Task №7 ------");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the string: ");
        String string = scan.nextLine();
      
        System.out.print("Input the letter: ");
        String letter = scan.nextLine();

        int count = 0;
        
        count = string.length() - string.replaceAll(letter, "").length();
        
        System.out.println("Number of the letter \"" + letter + "\" is: " + count);
        System.out.println("----- End of Task №7 ------");
    }
}
