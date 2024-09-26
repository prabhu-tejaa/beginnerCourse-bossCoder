package arrays;

import java.util.*;
public class array01MinimumAndMaximum {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int userInputForArraySize = input.nextInt();
        System.out.println("Enter your elements");
        int[] userInputForElements = new int[userInputForArraySize];
        for(int i = 0; i < userInputForArraySize; i++){
            userInputForElements[i] = input.nextInt();
        }
        int maxArray = userInputForElements[0], minArray = userInputForElements[0];
        for(int i=1;i<userInputForArraySize;i++){
            if(userInputForElements[i] > maxArray) {
                maxArray = userInputForElements[i];
            }
            if(userInputForElements[i] < minArray) {
                minArray = userInputForElements[i];
            }
        }
        System.out.println("Max" + maxArray);
        System.out.println("Min" + minArray);
    }
}
