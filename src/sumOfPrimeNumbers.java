import java.util.Scanner;

public class sumOfPrimeNumbers {
        public static void main(String[] args){

            // Approach 1
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number: ");
            int userInput = input.nextInt();
            int sum = 0;
            //Approach 1 - n*(n+1)
            System.out.println("The sum of even numbers of the given value "+ userInput + " is " + userInput*(userInput+1));
    }

}
