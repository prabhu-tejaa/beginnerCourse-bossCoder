import java.util.*;
public class patternProblem06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to the 6th star pattern.");
        int userInput = input.nextInt();
        for(int i=0;i<userInput;i++){
            for(int j=0;j<userInput;j++){
                if(i==0 || i==userInput-1 || j==0 || j==userInput-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
