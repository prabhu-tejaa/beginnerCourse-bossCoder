package bossCoderProblems.hashing;

import java.util.HashMap;

public class p117_findTheLengthOfLargestSubarrayWith0Sum {
    public static void main(String[] args) {
        // 117. Find the length of largest subarray with 0 sum
        
        // Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.
        // Examples:        
        // Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
        // Output: 5
        // Explanation: The longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}
        
        // Input: arr[] = {1, 2, 3}
        // Output: 0
        // Explanation: There is no subarray with 0 sum
        
        // Constraints:
        // 1 <= N <= 105
        // -1000 <= A[i] <= 1000, for each valid i

        // solution

        // int[] array = {1,-1,-2,2};
        // int sizeOfArray = array.length;
        // int maxLength = 0;
        // int sum = 0;
        // HashMap<Integer, Integer> hashMap = new HashMap<>();
        // hashMap.put(0, -1);
        // for(int i = 0; i<sizeOfArray;i++){
        //     sum+=array[i];
        //     if(hashMap.containsKey(sum)){
        //         maxLength = Math.max(maxLength,i-hashMap.get(sum));
        //     } else {
        //         hashMap.put(sum,i);
        //     }
        // }
        // System.out.println(maxLength);

        int[] array = {1,2,3};
        int lenght = array.length;
        int result = 0, sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<lenght;i++){
            sum+=array[i];
            if(map.containsKey(sum)){
                result = Math.max(result,i-map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        System.out.println(result);
    }
}
