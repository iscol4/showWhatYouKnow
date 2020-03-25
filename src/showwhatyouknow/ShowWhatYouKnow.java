/*
Isaac Collier
March 24 2020
This program uses arrays and loops to calculate an average for marks input by a user.
 */
package showwhatyouknow;

/**
 *
 * @author Isaac
 */
import java.util.Scanner;
public class ShowWhatYouKnow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
       
        double [ ] marks = new double [5];
      
        double total = 0;
        double average;
       
        System.out.println("Please enter your last five marks:");
         for (int i = 0; i <= 4; i = i + 1)
        {
            marks[i] = keyedInput.nextDouble();
        }
      
         for (int i = 0; i <= 4; i = i + 1)
        {
            total = total + marks[i];
        }
       
        average = total/5;
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
