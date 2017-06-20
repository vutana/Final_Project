
package display1;

/*\    /|  | =====  /\   |\  |  /\
 * \  / |  |   |   /__\  | \ | /__\
 *  \/  |__|   |  /    \ |  \|/    \
 *
 * 
 */
import java.util.Scanner;
public class ServiceDept {

    private String[] args;
           public void displayMessage () // Method to Set the total
    {
        System.out.println( " _______________");
        System.out.println( "|  Service Dept.|");
        System.out.println( "|      Menu     |");
        System.out.println( "|_______________|");          
     //Display a list of Inventories    
     System.out.print( " Please press 1 to View Oil Change appointments\n " ); 
     System.out.print( " Please press 2 to view Tire maintenance appointments\n " );
     System.out.print( " Please press 3 to Return to MAIN MENU\n " );
     //Create scanner to obtain user input
     Scanner input = new Scanner( System.in );
     double UserChoice;
     
    
    
        UserChoice = input.nextInt();//Input the user data
        
        while ( UserChoice == 1 )
        {
         
         //Display a list of inventory from the Display2 class    
         myOilChange.displayMessage ();//Display New Inventory
         break;
            
        }
         while ( UserChoice == 2)
         {
             
             myTireMaint.displayMessage ();
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

    private static class myOilChange {

        public static void displayMessage() {
        System.out.println("OIL Change Appointments::\n");
        System.out.println("Mark Messier:6/29/17, 10:30am");
        System.out.println("Steve Yzerman:6/30/17, 11:00am");
        System.out.println("\n");
        }
    }
  
    private static class myTireMaint {
       
       
      public static void displayMessage() {
       
        
        System.out.println("Tire Maintenance Appointments::\n");
        System.out.println("Ryan Ellis:7/01/17, 9:00am");
        System.out.println("Sydney Crosby:7/02/17, 10:00am");
        System.out.println("\n");
      
        }
    }
}
