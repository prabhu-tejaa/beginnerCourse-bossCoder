package bossCoderProblems.sorting;
import java.util.*;
public class p47_checkIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        int[] array1 = {1,2,5,4,3};
        int[] array2 = {1,2,3,4,5};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int sizeOfArray = array1.length;
        for(int i = 0; i<sizeOfArray;i++){
            if(array1[i] != array2[i]){
                System.out.println("Its not equal");
            }
        }
        System.out.println("Yes the array is equal");

        //or the best way

        int[] one = {5,2,3,4,1};
        int[] two = {5,2,3,1,4};
        int sizeOfArrayNew = one.length;

        int[] newArray = new int[1000000]; // constraint is 10^6
        for(int i = 0; i<sizeOfArrayNew;i++){
            newArray[one[i]]++;
            newArray[two[i]]--;
        }

        for(int i = 0; i<1000000;i++){
            if(newArray[i]!=0){
                System.out.println(false);
            }
        }
        System.out.println(true);

    }
}
