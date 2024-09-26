package arrays;

import java.util.*;
public class shuffleTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of your array");
        int sizeOfArray = input.nextInt();
        System.out.println("Please enter your elements in an array to shuffle the array");
        int[] userInput = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            userInput[i] = input.nextInt();
        }
        int sizeOfRealArray = userInput.length;
        if(sizeOfRealArray%2 != 0){
            int[] modifiedArray = new int[sizeOfRealArray-1];
            System.arraycopy(userInput,1,modifiedArray,0,sizeOfRealArray-1);
            userInput = modifiedArray;
            sizeOfRealArray = userInput.length;
        }
        int i =0, mid = sizeOfRealArray/2, index = 0;
        int[] arrayToStore = new int[sizeOfRealArray];
        while(mid<sizeOfRealArray){
            arrayToStore[index++] = userInput[i++];
            arrayToStore[index++] = userInput[mid++];
        }
        System.out.println(Arrays.toString(arrayToStore));
    }
}
