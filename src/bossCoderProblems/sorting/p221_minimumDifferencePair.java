package bossCoderProblems.sorting;
import java.util.*;
public class p221_minimumDifferencePair {
    public static void main(String[] args) {
        int[] nums = {3,10,8,6};
        Arrays.sort(nums);
        int sizeOfArray = nums.length;
        int ans = nums[1] - nums[0];
        for(int i = 2;i<sizeOfArray;i++){
            if(nums[i] - nums[i-1] < ans){
                ans = nums[i]-nums[i-1];
            }
        }
        System.out.println(ans);
    }
}
