/**
 * Dylan Klingensmith
 * CH5PC19 - Square Display
 * AP Computer Science 
 * 12/3/18
 */

import java.util.Scanner;

public class SquareDisplay {

    public static void main(String[] args) {
        
        //Establish scanner and variables
        Scanner keyboard = new Scanner(System.in);
        
        int num;
        
        //Get number and validate
        System.out.println("Input a positive number no greater than 15.");
        num = keyboard.nextInt();
        
        while (num < 0 || num > 15) {
            
            System.out.println("This number is not applicable.");
            num = keyboard.nextInt();
            
        }
        
        //Print square
        for (int x = 0; x < num; x++)   {
            
            for (int y = 0; y < num; y++)   {             
                System.out.print("X");
            }
            
            System.out.println("");
            
        }
    }

}
