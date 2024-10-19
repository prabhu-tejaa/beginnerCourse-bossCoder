package exam01;
import java.util.*;
public class practiseHashing {
    static int functionOne(int[] array, int check){
        int sizeOfLength = array.length;
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i<sizeOfLength;i++){
            int count = frequencyMap.getOrDefault(array[i],0);
            if(count+1 == check){
                return array[i];
            } else {
                frequencyMap.put(array[i], count+1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
// 122. First element to occur k times

// Given an array of N integers. Find the first element that occurs at least K number of times. If the answer is not present in the array, return -1.

// Input 1: N = 7, K = 2, A[] = {1, 7, 4, 3, 4, 8, 7}
// Output 1: 4
// Explanation 1: Both 7 and 4 occur 2 times. But 4 is first that occurs 2 times As at index = 4, 4 has occurred atleast 2 times whereas at index = 6, 7 has occurred atleast 2 times.

// Input 2: N = 7, K = 1, A[] = {1, 7, 4, 3, 4, 8, 7}
// Output 2: 1
// Constraints:
// 1 <= A.length <= 10000
// 1 <= K <= 100
// 1 <= A[i] <= 103

// soo the how do you get the intuition here. I don't know

int[] array = {1,2,3,4,5,6,7,8,8};
int check = 2;
int answer = functionOne(array, check);
System.out.println(answer);
    }

}
