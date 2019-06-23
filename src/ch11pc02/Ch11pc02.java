package ch11pc02;
import java.util.Scanner;

/**
 *
 * @author Frank
 * date 11/28/2017
 */
public class Ch11pc02 {

    public static void main(String[] args) {
        // variables
        int numberOfTests, score;
        
        //instantiate Scanner class keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //request user to input scores
        System.out.print("Please enter the number of tests. ");
        numberOfTests = keyboard.nextInt();
        
        //instantiate the TestScores class
        TestScores testScores = new TestScores(numberOfTests);
        
        //request scores from user
        for (int i = 0; i < numberOfTests; i++) {
            System.out.print("Please enter the score for test #" + (i + 1) + ". ");
            score = keyboard.nextInt();
            try {
                testScores.setScores(score, i);
            }
            catch (InvalidTestScore ex) {
                System.out.println(ex.getMessage());
                i--;
            }
        }

        //display the average for the scores
        System.out.println("The average of the test scores is: " + testScores.getAverage() + ".");

        
    }
    
}
