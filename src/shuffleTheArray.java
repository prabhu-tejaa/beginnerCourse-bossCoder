import java.util.*;
public class shuffleTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of your array");
        int sizeOfArray = input.nextInt();
        System.out.println("Please enter your elements in an array to shuffle the array");
        int[] userInput = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            userInput[i] = input.nextInt();
        }
//        int lengthArray = userInput.length;
//        int n = userInput.length;
//        int i = 0, j = n / 2;
//        int[] ans = new int[n]; // Static array of size n
//
//        int index = 0;
//        while (j < n) {
//            ans[index++] = userInput[i++]; // Copy element at i to ans, then increment i and index
//            ans[index++] = userInput[j++]; // Copy element at j to ans, then increment j and index
//        }
//        System.out.println(Arrays.toString(ans));


        int sizeOfRealArray = userInput.length;
        int i =0, mid = sizeOfRealArray/2, index = 0;
        int[] arrayToStore = new int[sizeOfRealArray];
        while(mid<sizeOfRealArray){
            arrayToStore[index++] = userInput[i++];
            arrayToStore[index++] = userInput[mid++];
        }
        System.out.println(Arrays.toString(arrayToStore));
    }
}
