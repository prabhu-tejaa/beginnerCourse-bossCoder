package bossCoderProblems.hashing;
import java.util.*;
public class p39_checkArithmeticProgression {
    public static void main(String[] args) {

        //one east way without hashmap

        int[] array = {10,2,4,6,8};
        Arrays.sort(array);
        int difference = array[1]-array[0];
        for(int i = 2;i<array.length;i++){
            if(array[i]-array[i-1] != difference){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
