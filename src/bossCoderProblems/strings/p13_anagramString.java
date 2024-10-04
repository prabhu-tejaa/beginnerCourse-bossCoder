package bossCoderProblems.strings;
import java.util.*;
public class p13_anagramString {
    static boolean anagramCheck(String userStringOne, String userStringTwo){
        int totalAlphabets = 26;
        int[] frequencyOne = new int[totalAlphabets];
        int[] frequencyTwo = new int[totalAlphabets];
        if(userStringOne.length() != userStringTwo.length()){
            return false;
        }
        for(int i = 0; i<userStringOne.length();i++){
            char currentWordOfFirstString = userStringOne.charAt(i);
            char currentWordOfSecondString = userStringTwo.charAt(i);
            if(currentWordOfFirstString >= 'a' && currentWordOfSecondString <= 'z'){
                frequencyOne[currentWordOfFirstString-'a']++;
            }
            if(currentWordOfFirstString >= 'A' && currentWordOfSecondString <= 'Z'){
                frequencyOne[currentWordOfFirstString-'A']++;
            }
            if(currentWordOfSecondString >= 'a' && currentWordOfSecondString <= 'z'){
                frequencyTwo[currentWordOfSecondString-'a']++;
            }
            if(currentWordOfSecondString >= 'A' && currentWordOfSecondString <= 'Z'){
                frequencyTwo[currentWordOfSecondString-'A']++;
            }
        }
        for(int i = 0; i < totalAlphabets;i++){
            if(frequencyOne[i] != frequencyTwo[i]){
                return false;
            }
        }
        return true;
    }
    // anagram
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first string of which you wanna check if its an anagram");
        String anagramCheck = input.nextLine();
        System.out.println("Please enter the second string of which you wanna check if its an anagram");
        String userStringTwo = input.nextLine();
        System.out.println(anagramCheck(anagramCheck,userStringTwo));
    }
}
