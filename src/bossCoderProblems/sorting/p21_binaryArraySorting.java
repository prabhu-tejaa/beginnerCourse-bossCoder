package bossCoderProblems.sorting;
import java.util.*;
public class p21_binaryArraySorting {
    public static void main(String[] args) {

        //one way - time complexity - O(n log n)
        int[] array1 = {0,1,0,0,1,1,1,0};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        //second way

        int[] array2 = {0,1,0,1,0,1,0,1,0,0};
        int sizeOfArray = array2.length;
        int zero = 0;
        int[] answer = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray;i++){
            if(array2[i] == 0){
                zero++;
            }
        }
        for(int i = 0,j=0;i<sizeOfArray;i++){
            if(zero-- > 0){
                answer[j++] = 0;
            } else {
                answer[j++] = 1;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
