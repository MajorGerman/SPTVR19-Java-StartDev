package startdev;
import java.util.Random;

public class Task4 {
    public void run(){
        System.out.println("\n----- Task №4 ------");
        
        int myArr[] = new int[10];
        
        Random rand = new Random();
        
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rand.nextInt(20-0+1)-0; 
            if ((myArr[i] % 2) != 0) {
                i -= 1;
                continue;
            }
            System.out.printf("%4d", myArr[i]);
        }
        
        System.out.println("\n----- End of Task №4 ------");
    }                 
}
