
package display1;

/**
 *\    /|  | =====  /\   |\  |  /\
 * \  / |  |   |   /__\  | \ | /__\
 *  \/  |__|   |  /    \ |  \|/    \
 */

import java.util.Scanner;

public class Display1 {

    
    public static void main(String[] args) {
         //Create scanner to obtain user input
        Scanner input = new Scanner( System.in );
      
        Inventory myDisplay2 = new Inventory();
        ServiceDept myDisplay3 = new ServiceDept();
       
        double UserChoice;
     
        System.out.println( " _______________");
        System.out.println( "|      MAIN     |");
        System.out.println( "|      MENU     |");
        System.out.println( "|_______________|");
                
        
        //Prompts the user to enter data
        System.out.print( "Enter:: (1) for Inventory\n ");
        System.out.print("Enter:: (2) for Service Dept.\n ");
        System.out.print("Enter:: (3) for Commission\n ");
        
  
        UserChoice = input.nextInt();//Input the user data
        
        while ( UserChoice == 1 )
        {
         
         //Display a list of inventory from the Display2 class    
         myDisplay2.displayMessage ();//Display the total
         break;
            
        }
         while ( UserChoice == 2)
         {
             
             myDisplay3.displayMessage ();
             break;
             
             }
         while ( UserChoice == 3)
         {
             Commission.main(args);
             break;
         }  
         while ( UserChoice > 3)
         {
           System.out.println("Error Message !!!\n");
            break;
         
         }
        
        } 
 
    }
    

