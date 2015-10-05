import java.util.Scanner;

public class LoopCompletion {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num, total = 0;
        int count = 1;
        		
        // Loop should start here
        do{
        	
        System.out.print("Please enter an integer.");
        num = keyboard.nextInt();
        total += num;
        count++;
        
        //Loop should end here
        }while(count <=10);
        
        
        System.out.println("The total of all 10 numbers is " + total);
        keyboard.close();
        
        }
        
}
