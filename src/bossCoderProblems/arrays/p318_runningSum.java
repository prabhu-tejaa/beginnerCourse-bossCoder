package bossCoderProblems.arrays;

import java.util.*;

public class p318_runningSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you array size:");
        int lengthOfArray = input.nextInt();
        int[] originalArray = new int[lengthOfArray];
        for(int i = 0; i< lengthOfArray; i++){
            originalArray[i] = input.nextInt();
        }
        int lengthOfOriginalArray = originalArray.length;

        for(int i = 1; i < lengthOfOriginalArray;i++){
            originalArray[i] += originalArray[i-1];
        }
        System.out.println(Arrays.toString(originalArray));
    }
}
