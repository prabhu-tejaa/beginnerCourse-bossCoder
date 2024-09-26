package maths;

import java.util.*;

public class sizeNArraySumIs0 {
    public static void main(String[] args) {

        // given an integer n, create an array of size n having sumOfAnswerArray zero with unique values

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int userInput = input.nextInt();

        // initializing & declaring answers array with size of userInput
        int[] answer = new int[userInput];
        int sumOfAnswerArray = 0;

        //lopping to add values to elements in answers[]
        for(int i = 0; i<userInput-1; i++){
            answer[i]=i+1;
            // keeping ths sum of all added elements in the answers[]
            sumOfAnswerArray += answer[i];
        }

        // adding last index of the answers array with the negative value so that we can satisfy the portable statement
        answer[userInput-1] = -1* sumOfAnswerArray;

        // just for confirmation we are adding up all the values in the array to sum up to 0
        int addArray = 0;
        for(int i = 0; i<userInput;i++){
            addArray += answer[i];
        }
        System.out.println(addArray);

    }
}
