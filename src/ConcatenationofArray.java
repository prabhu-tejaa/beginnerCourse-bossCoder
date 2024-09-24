import java.util.*;

public class ConcatenationofArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of your array: ");
        int sizeOfArrayFromUser = input.nextInt();
        System.out.println("Please enter " + sizeOfArrayFromUser +  " elements for the array: ");
        int[] userInput = new int[sizeOfArrayFromUser];
        for(int i =0; i < sizeOfArrayFromUser; i++){
            userInput[i] = input.nextInt();
        }
        int sizeOfInput = userInput.length;
        int[] concatenatedArray = new int[sizeOfInput*2];
        for(int i = 0; i<sizeOfInput; i++){
            concatenatedArray[i] = userInput[i];
            concatenatedArray[i+sizeOfInput] = userInput[i];
        }
        System.out.println(Arrays.toString(concatenatedArray));
    }
}
