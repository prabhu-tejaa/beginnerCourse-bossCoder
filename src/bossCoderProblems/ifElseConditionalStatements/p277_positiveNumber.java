package bossCoderProblems.ifElseConditionalStatements;
import java.util.*;
public class p277_positiveNumber {
    static int count(int[] input){
        int sizeOfArray = input.length;
        int count = 0;
        for(int i = 0; i<sizeOfArray; i++){
            if(input[i] > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of your array.");
        int sizeOfArray = input.nextInt();
        int[] userInputArray = new int[sizeOfArray];
        System.out.println("Please enter "+sizeOfArray+" values to fill the array.");
        for(int i = 0; i<sizeOfArray;i++){
            userInputArray[i] = input.nextInt();
        }
        System.out.println("The count of positive numbers present in the given array is: "+count(userInputArray));
    }
}
