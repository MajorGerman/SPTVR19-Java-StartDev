package startdev;
import java.util.Random;

public class Task3 {
    public void run(){
        System.out.println("\n----- Task №3 ------");
        
        System.out.println("Random Number Array!");
        int myArr[] = new int[10];
        
        Random rand = new Random();
        int min = 20;
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rand.nextInt(20-0+1)-0;
            sum += myArr[i];
            if (myArr[i] > max) {
                max = myArr[i];
            } 
            if (myArr[i] < min) {
                min = myArr[i];
            } 
            System.out.printf("%4d", myArr[i]);
        }
        System.out.println("");
        System.out.println("All Array Numbers Sum: " + sum);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("----- End of Task №3 ------");
    }
}
