package basics;

import java.util.*;
public class forAndWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many times you wanna loop??");
        int loopingValue = input.nextInt();
        int iteration = 1;
        for(int i = 1; i<= loopingValue; i++){
            System.out.println(i + ". Hello Iam looping in for loop");
        }
        while(iteration <= loopingValue){
            System.out.println(iteration + ". Hello Iam looping in while loop");
            iteration++;
        }
    }
}
