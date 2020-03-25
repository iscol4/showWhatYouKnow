/*
Isaac Collier
March 24 2020
This program uses arrays and loops to calculate an average for marks input by a user.
 */
package showwhatyouknow;

/**
 *
 * @author Isaac
 *  This class is teaching me bout arrays and how to use them to make repeated code quicker.
 */
import java.util.Scanner;
public class ShowWhatYouKnow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
            //creates array:
        double [ ] marks = new double [5];
        
         //declares variables:
        double total = 0;
        double average;
        
         //asks user for their marks:
        System.out.println("Please enter your last five marks:");
        
        //loop that stores five double values for marks:
         for (int i = 0; i <= 4; i = i + 1)
        {
            marks[i] = keyedInput.nextDouble();
        }
         
      //Loop that adds the double values together:
         for (int i = 0; i <= 4; i = i + 1)
        {
            total = total + marks[i];
        }
       
         //uses sum of marks to find average and rounds to one decimal place:
        average = total/5;
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        //displays mark average to user:
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
