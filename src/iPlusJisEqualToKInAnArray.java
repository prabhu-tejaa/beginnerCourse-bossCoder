import java.util.*;
public class iPlusJisEqualToKInAnArray {
    public static void main(String[] args) {

        //question-

        // given an array userArray and an integer searchNumber. Find if there exists i,j such that userArray[i] + userArray[j] = searchNumber;
        int searchNumber = 28;
        int[] userArray = {5,2,18,10,7};
        int n = userArray.length;

        int max = userArray[0];
        for(int i = 0; i <= n-1;i++){
            if(userArray[i] > max){
                max = userArray[i];
            }
        }

        System.out.println(max);

        boolean[] attendance = new boolean[max+1];

        for(int i = 0; i<=n-1;i++){
            attendance[userArray[i]]=true;
        }

        System.out.println(Arrays.toString(attendance));

        for(int i = 0; i<= n-1; i++){
            //underflow and overflow
            if(searchNumber >= userArray[i] && searchNumber-userArray[i]<=max && attendance[searchNumber-userArray[i]] == true){
                System.out.println(searchNumber-userArray[i]);
            }
        }
    }
}
