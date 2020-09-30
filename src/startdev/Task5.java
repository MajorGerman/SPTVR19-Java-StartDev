package startdev;

import java.util.Random;

public class Task5 {
    public void run(){
        System.out.println("\n----- Task №5 ------");
        
        int myArr[][] = new int[10][5];
        
        Random rand = new Random();
        
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                myArr[i][j] = rand.nextInt(20-0+1)-0;
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("----- End of Task №5 ------");
    }
}
