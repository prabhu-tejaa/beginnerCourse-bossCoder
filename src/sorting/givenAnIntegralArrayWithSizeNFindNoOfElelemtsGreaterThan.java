package sorting;
import java.util.*;
public class givenAnIntegralArrayWithSizeNFindNoOfElelemtsGreaterThan {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5};
        Arrays.sort(array);
        int max = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        int[] index = new int[max+1];
        Arrays.fill(index, -1);
        for(int i = 0; i<array.length;i++){
            index[array[i]] = i;
        }
        System.out.println(Arrays.toString(index));
        int q = 1; // no of queries
        int x = 0;
        while(q>0){
            int k = 5; // user given values
            x = array.length-1-k;
            q--;
            System.out.println(x);

        }
    }
}
