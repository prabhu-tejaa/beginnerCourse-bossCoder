package bossCoderProblems.strings;
import java.util.*;
public class p314_ReverseWordsInAGivenSstring {
    static String reverseString(String userString){
        int lengthOfUserString = userString.length();
        String word = "";
        String reversedString = "";
        for(int i = 0; i<lengthOfUserString; i++){
            char currentLetter = userString.charAt(i);
            if(currentLetter != ' '){
                word += currentLetter;
            } else {
                reversedString = word + " " + reversedString;
                word = "";
            }
        }
        reversedString += word;
        return reversedString.trim();
    }
    public static void main(String[] args) {
        // the question here is, in a given string please reverse it
        // if the string is I love you universe then it should be universe loves I

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word you wanna reverse.");
        String userString = input.nextLine();
        System.out.println(reverseString(userString));
    }
}
