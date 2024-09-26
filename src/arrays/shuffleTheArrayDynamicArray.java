package arrays;

import java.util.*;

public class shuffleTheArrayDynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of your array");
        int sizeOfArray = input.nextInt();
        System.out.println("Please enter your elements in an array to shuffle the array");
        List<Integer> userInput = new ArrayList<>();
        for(int i = 0; i < sizeOfArray; i++){
            userInput.add(input.nextInt());
        }
        if(userInput.size() %2 != 0){
            userInput.removeFirst();
        }
        int sizeOfRealArray = userInput.size();
        int mid = sizeOfRealArray/2; int i = 0;
        List<Integer> answer = new ArrayList<>();

        while(mid<sizeOfRealArray){
            answer.add(userInput.get(i++));
            answer.add(userInput.get(mid++));
        }
        System.out.println(answer);
    }
}
