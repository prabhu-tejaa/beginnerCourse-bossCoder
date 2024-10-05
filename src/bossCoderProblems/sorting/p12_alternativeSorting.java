package bossCoderProblems.sorting;
import java.util.*;
public class p12_alternativeSorting {
    public static void main(String[] args) {
        int[] array = {5,4,3,7,2,1,6};
        int sizeOfArray = array.length;
        int startingOfIndex = 0, endingOfIndex = sizeOfArray-1,index=0;
        int[] ans = new int[sizeOfArray];
        Arrays.sort(array);
        while(startingOfIndex < endingOfIndex){
            ans[index++] = array[endingOfIndex--];
            ans[index++] = array[startingOfIndex++];
        }
        if(sizeOfArray%2 == 1){
            ans[index++] = array[sizeOfArray/2];
        }
        System.out.println(Arrays.toString(ans));
    }
}
