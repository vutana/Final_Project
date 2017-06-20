
package display1;

import java.util.Scanner;

/**
 *
 * @author vutan
 */
public class Commission {
    public static void main(String[] args) {
      //Create scanner to obtain user input
        Scanner input = new Scanner( System.in );
   
       
   
    double Total = 0;
    double AnnualSales;
    double Comission ;
    double Menu;
    
    Comission = .05; //Establishes the comission is 5 percent
    
        //Prompts the user to enter data
        System.out.print( "Enter Your Sales For The Year: ");
        AnnualSales = input.nextInt();//Input the user data
        
        
             //If sales are more than $150,000, the extra bonus will be enabled.
      while ( AnnualSales > 150000 )
      {
        Comission = AnnualSales * 0.065; //calculate the user data 
        Total = Comission + 60000;//Calculate the Comission and default salary
System.out.printf( " Congratulations! You have exceeded the sales goal for the year.\n" );
System.out.printf( " You have earned a bonus, your new salary, including the yearly bonus is $%.2f\n" , Total );
    
        break;

      }
    //Engages the bonus if sales are more than $120,000. 
     while ( AnnualSales > 120000 )
        { 
        Comission = AnnualSales * 0.05; //calculate the user data 
        Total = Comission + 60000;//Calculate the Comission and default salary
        System.out.println( " THANK YOU!" ); 
        System.out.println( " You have met the requirements of the incentive program. " ); 
        System.out.printf( " Your Total Annual Salary is $%.2f\n" , Total );
         
       //Enables the user to return back to the manin menu
        System.out.print( "Please Enter '0' to RETURN to the MAIN MENU \n ");
        Menu = input.nextInt();
        while (Menu == 0)
          {
          
           Display1.main(args);
            break;
          }
        break;
       
        }
 
     //If sales are less than $120,000, the screen will display the default salary.
     while ( AnnualSales < 120000 )
        {
         //Display the annual salary    
      System.out.println( " Unfortunately you have not met the requirements to receive an incentive." ); 
      System.out.println( " Your are only eligible to receive the base salary $ " ); 
      System.out.println( " Your Total Annual Salary is $60,000\n" ); 
           //Enables the user to return back to the manin menu
      System.out.print( "Please Enter '0' to RETURN to the MAIN MENU \n ");
        Menu = input.nextInt();
        while (Menu == 0)
          {
          
           Display1.main(args);
            break;
          }
        break;
        }
     }
        
}
