package startdev;
import java.util.Scanner;

class Task1 {
    public void run(){
        System.out.println("\n----- Task №1 ------");
        System.out.print("Input the temperature in Celsius: ");
        
        Scanner scan = new Scanner(System.in);
        int celsius = scan.nextInt();
        
        System.out.println("Fahrenheits: " + (celsius*1.8+32));
        System.out.println("----- End of Task №1 ------");
    }
}
