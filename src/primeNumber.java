import java.util.*;
public class primeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to get get if its prime number or not");
        int userInput = input.nextInt();
        String result = "Null";
        System.out.println(userInput);
        for(int i = 2; i*i <= userInput; i++){
            if(userInput%i == 0){
                result = "not a prime number";
            } else {
                result = "prime number";
            }
        }
        System.out.println(result);
    }
}
