package practise;
import java.util.*;

public class sizeNArraySumIs0Practise01 {
    public static void main(String[] args){

        // take the input from the user so that we can proceed to create the array of the size given by the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please the number for the array size you want it to be: ");
        int userInput = input.nextInt();

        // let's create an array with the size of userInput where we will be adding numbers so that the sum would be 0, based on the problem statement
        int answers[] = new int[userInput];

        // let's have variable where put all count of elements in the array
        int sumOfTheArray = 0;

        // now lets add values to the elements in the array
        // here we'll be taking the loop for userInput-1 times because as per our logic we want to give negative number in the end to make the sum of all elements 0

        for(int i = 0; i < userInput-1; i++){
            answers[i] = i+1;
            sumOfTheArray += answers[i];
        }
        answers[userInput-1] = -1*sumOfTheArray;

        // now let us verify weather the total sum of the answers[] is 0
        int sumOfAll = 0;

        for(int i = 0; i<userInput; i++){
            sumOfAll += answers[i];
        }
        System.out.println("The sum of all numbers in the array is: " + sumOfAll);
    }
}
