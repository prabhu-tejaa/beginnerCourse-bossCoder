package exam01;
import java.util.*;
public class practiseSorting {

    static boolean check(int[] one, int[] two){
        int[] answer = new int[100000];
        int size = one.length;
        for(int i = 0; i<size;i++){
            answer[one[i]]++;
            answer[two[i]]--;
        }
        for(int i = 0;i<10;i++){
            if(answer[i] != 0){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {

//     47. Check if two arrays are equal or not

// Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
// Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

// Input 1: A[] = {1,2,5,4,0} , B[] = {2,4,5,0,1}
// Output 1: true
// Explanation 1: Both the array can be rearranged to {0,1,2,4,5}

// Input 2: A[] = {1,2,5} , B[] = {2,4,15}
// Output 2: false

// Constraints:
// 1 <= A.length, B.length <= 105
// 1<= A[i], B[i] <= 106

    int[] arrayOne = {1,2,3,4,5,6,7};
    int[] arrayTwo = {9,6,5,4,3,2,1};

    // way1
    // Arrays.sort(arrayTwo);
    // System.out.println(Arrays.toString(arrayTwo));
    // if(Arrays.equals(arrayOne,arrayTwo)){
    //     System.out.println("Two arrays are equal ;)");
    // } else {
    //     System.out.println("Naa both arrays are not equal!");
    // }

    // way2
    boolean answer = check(arrayOne,arrayTwo);
    System.out.println(answer);

//     21. Binary Array Sorting

// Given a binary array A[] of size N. The task is to arrange the array in increasing order.

// Note: The binary array contains only 0 and 1.

// Input 1: arr[] = {1, 0, 1, 1, 0}
// Output 1: 0 0 1 1 1
// Explanation 1: After arranging the elements in increasing order, elements will be as 0 0 1 1 1.

// Input 2: arr[] = {1, 0}
// Output 2: 0 1

// Constraints:
// 1 <= A.length <= 105
// 0 <= A[i] <= 1

// way1
// int[] binaryArray = {1,0,1,1,1,0,0,1,0,0};
// Arrays.sort(binaryArray);
// System.out.println(Arrays.toString(binaryArray));

//way2
    int[] binaryArray = {1,0,1,1,1,0,0,1,0,0};
    int sizeOfBinaryArray = binaryArray.length;
    int[] answerArray = new int[sizeOfBinaryArray];
    int zero = 0;
    for(int i = 0; i<sizeOfBinaryArray;i++){
        if(binaryArray[i] == 0){
            zero++;
        }
    }
    for(int i = 0,j=0;i<sizeOfBinaryArray;i++){
        if(zero-- > 0){
            answerArray[j++]=0;
        } else {
            answerArray[j++]=1;
        }
    }
    System.out.println(Arrays.toString(answerArray));
}
}
