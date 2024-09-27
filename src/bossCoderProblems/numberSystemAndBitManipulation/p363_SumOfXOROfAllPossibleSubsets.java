package bossCoderProblems.numberSystemAndBitManipulation;
import java.util.*;

public class p363_SumOfXOROfAllPossibleSubsets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size: ");
        int userArraySize = input.nextInt();
        System.out.println("Please enter " + userArraySize + " values to fill the array:");
        int[] originalUserArray = new int[userArraySize];
        for(int i = 0; i< userArraySize; i++){
            originalUserArray[i] = input.nextInt();
        }

        // now the question
//        Given an array arr[] of size n, we need to find the sum of all the values that come from XORing all the elements of the subsets.

        int sizeOfOriginalUserArray = originalUserArray.length;
        int sumOfXoring = 0;

        for(int i = 0; i < (1<<sizeOfOriginalUserArray); i++){
            int xoring = 0;
            for(int j = 0; j < sizeOfOriginalUserArray; j++){
                int bitmask = (1<<j);
                if((i&bitmask) != 0){
                    xoring ^= originalUserArray[j];
                }
            }
            sumOfXoring += xoring;
        }
        System.out.println("The total xoring of the given array subset is: "+ sumOfXoring);
    }
}
