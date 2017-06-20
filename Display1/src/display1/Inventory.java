
package display1;

import java.util.Scanner;

/**
 *
 *\    /|  | =====  /\   |\  |  /\
 * \  / |  |   |   /__\  | \ | /__\
 *  \/  |__|   |  /    \ |  \|/    \
 */
public class Inventory {

    private String[] args;
    
        public void displayMessage () 
    {
        
        System.out.println( " _______________");
        System.out.println( "|    Inventory  |");
        System.out.println( "|      Menu     |");
        System.out.println( "|_______________|");
    //Display a list of Inventories    
     System.out.print( " Please press (1) for New Inventory\n " ); 
     System.out.print( "Please press (2) for Used Inventory\n " );
     System.out.print( "Please press (3) to Return to MAIN MENU\n " );
     
     //Create scanner to obtain user input
     Scanner input = new Scanner( System.in );
     double UserChoice;
    
    
        UserChoice = input.nextInt();//Input the user data
        
        while ( UserChoice == 1 )
        {
         
         //Display a list of inventory from the Display2 class    
         myNewInventory.displayMessage ();//Display New Inventory
        break;
            
        }
        
         while ( UserChoice == 2)
         {
             
             myUsedInventory.displayMessage ();
             break;
             
             }
           
         while ( UserChoice > 3)
         {
           System.out.print("Error Message !!!\n");
            break;
           }
        while ( UserChoice == 3)
        {
            Display1.main(args);
            break;
            
        }
        
}
// Subclasses of Inventory
    private static class myNewInventory {

        public myNewInventory() {
        }
        public static void displayMessage(){
        System.out.println("New Inventory::");
         System.out.println("2017 Honda Accord ");
          System.out.println("2017 Mercedes AMG ");
           System.out.println("2018 Acura Integra ");
            System.out.println("2018 Dodge Viper\n");
           
        }
        
    }

    private static class myUsedInventory {

        public myUsedInventory() {
        }
        public static void displayMessage(){
        System.out.println("Used Inventory::");
         System.out.println("2008 Toyota Camry");
          System.out.println("2010 Kia Forte");
           System.out.println("2001 Chevrolet Tahoe");
            System.out.println("2004 Ford Focus\n");
            
        }
    }
}