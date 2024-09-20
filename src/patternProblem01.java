import java.util.*;
public class patternProblem01 {
    public static void main(String[] args){

        // 1. Print the Square Star Pattern for the given value of N.
//        ****
//        ****
//        ****
//        ****

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to ger square star pattern: ");
        int userInputValue = input.nextInt();

        for(int i = 0; i<userInputValue; i++){
            for(int j = 0;j<userInputValue;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
