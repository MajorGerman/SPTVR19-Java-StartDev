package startdev;
import java.util.Scanner;

public class StartDev {

    public static void main(String[] args) {
        System.out.println("[ StartDev Program Pack ]");
        System.out.println("[ By Georg Laabe ]");
        
        System.out.println("\n --- Programs --- ");
    
        System.out.println("1. Celsius to Fahrenheit Converter");
        System.out.println("2. Quess the number from 5 to 10");
        System.out.println("3. Random Number Array");
        System.out.println("4. Random Even Number Array!");
        System.out.println("5. Random Number Two-Dimensional Array!");
        System.out.println("6. Random Number Two-Dimensional Jagged Array!");
        System.out.println("7. Number of letter in string");
        
        System.out.print("\nChoose program(1-7): ");
        
        Scanner scan = new Scanner(System.in);
        int program = scan.nextInt();
       
        switch (program) {
            default:
                System.out.println("There is no variant like that!");
                break;
            case 1:
                Task1 task1 = new Task1();
                task1.run();
                break;
            case 2:
                 Task2 task2 = new Task2();
                 task2.run();  
                 break;
            case 3:
                 Task3 task3 = new Task3();
                 task3.run();
                 break;
            case 4:
                 Task4 task4 = new Task4();
                 task4.run();  
                 break;
            case 5:
                 Task5 task5 = new Task5();
                 task5.run();  
                 break;
            case 6:
                 Task6 task6 = new Task6();
                 task6.run();  
                 break;
            case 7:
                 Task7 task7 = new Task7();
                 task7.run();  
                 break;
      }
    } 
}
