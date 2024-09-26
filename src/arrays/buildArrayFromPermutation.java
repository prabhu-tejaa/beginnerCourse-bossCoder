package arrays;

import java.util.*;
public class buildArrayFromPermutation {
    public static void main(String[] args) {
//        Input: nums = [0,2,1,5,3,4];
//        Output: [0,1,2,4,5,3];
//        that means:
//        formula: ans[i] = nums[nums[i]]
//          always input from the user is nums.length - 1

        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in your array: ");
        int noOfElementsInYourArray = input.nextInt();
        int[] inputArrayOfUser = new int[noOfElementsInYourArray];
        System.out.println("Please enter " + noOfElementsInYourArray + " values to fill your array.");
        for(int i = 0; i<noOfElementsInYourArray;i++){
            inputArrayOfUser[i] = input.nextInt();
        }

        int arraySizeOfTheUser = inputArrayOfUser.length;
        int[] answer = new int[arraySizeOfTheUser];
        for(int i = 0; i<arraySizeOfTheUser; i++){
            answer[i] = inputArrayOfUser[inputArrayOfUser[i]];
        }

        //output

        for(int i =0; i<arraySizeOfTheUser; i++){
            System.out.println(answer[i] + " ");
        }
    }
}
