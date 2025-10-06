
import java.util.Scanner;

public class celcuisToFarenheit{
public static void main(String[] agrs){
    Scanner keyboard = new Scanner(System.in);
    // variable 
    // enter temperature in celcuis
    System.out.println("Enter temperature in celcuis:");
    double temp_celcuis  = keyboard.nextDouble ();
    // convert temperature celcuis to farenheit
    Double temp_farenheit = ((1.8 * temp_celcuis) + 32);
    System.out.println("the temperature in Fahrenheit is " + temp_farenheit + " degrees");
    keyboard.close();
}
}
/////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            (convert celcuis to farenheit)
// Files:            (java)
// Semester:         spring 2025
//
// Author:           (Nathanael Paraison)
// Email:            (paraisonnathanael94@gmail.com)
// Login:            (Nathanael Paraison)
//
//
//                   STUDENTS WHO GET HELP FROM ANYONE 
// Credits:          (list anyone who helped you write your program)
//////////////////////////// 80 columns wide //////////////////////////////////