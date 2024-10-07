package bossCoderProblems.hashing;
import java.util.*;
public class p122_firstElementToOccurkTimes {
    public static void main(String[] args) {

    int[] input = {1,2,3,6,6,3,2,1};
    int repeatedTimes = 2;
    HashMap<Integer,Integer> frequency = new HashMap<>();
    int sizeOfArray = input.length;
    for(int i = 0;i<sizeOfArray;i++){
        int count = frequency.getOrDefault(input[i],0);
        if(count+1 == repeatedTimes){
            System.out.println(input[i]);
        } else {
            frequency.put(input[i],count+1);
        }
        }
        System.out.println("If everything fails -1");
    }
}
