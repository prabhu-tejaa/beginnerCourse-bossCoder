package bossCoderProblems.functions;
import java.util.*;
public class p95_fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value till which you want the fibonacci sequence");
        int userInput = input.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci sequence for the give value "+ userInput + " ->");
        for(int i = 0; i<userInput;i++){
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
