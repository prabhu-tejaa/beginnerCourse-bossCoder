package bossCoderProblems.strings;
import java.util.*;
public class p260_palindromeString {
    static boolean palindromeCheck(String userString){
        int left = 0;
        int right = userString.length()-1;
        while(left < right){
            if(userString.charAt(left) != userString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to check if it is a palindrome or not.");
        String userString = input.nextLine();
        System.out.println(palindromeCheck(userString));
    }
}
