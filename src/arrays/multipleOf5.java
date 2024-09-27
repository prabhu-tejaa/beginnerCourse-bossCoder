package arrays;

import java.util.Arrays;

public class multipleOf5 {
    public static void main(String[] args) {

        int n = 17;
        int[] answer = new int[n/5];
        for(int i = 5, j=0;i<=n;i=i+5){
            answer[j++] = i;
        }
        System.out.println(Arrays.toString(answer));
    }
}
