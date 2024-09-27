package arrays;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args){
        int[] originalArray = {1,2,3,4,5,6,7};
        int sizeOfOriginalArray = originalArray.length;
        int[] reversedArray = new int[sizeOfOriginalArray];
        for(int i = 0; i<sizeOfOriginalArray;i++){
            reversedArray[i] = originalArray[sizeOfOriginalArray - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
