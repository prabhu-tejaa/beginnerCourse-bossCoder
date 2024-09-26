package basicsOfProgramming;

import java.util.*;
public class sumOfOddNumber {
    public static void main(String[] args){

        // Approach 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int userInput = input.nextInt();
        int sum = 0;
        for(int i = 1; i<2*userInput;i+=2){
            sum+=i;
        }
        System.out.println("The sum of odd numbers of the given value "+ userInput + " is " + sum);

        //Approach 2 - nsqaure
        System.out.println("The sum of odd numbers of the given value "+ userInput + " is " + (userInput*userInput));
    }
}
