package bossCoderProblems.strings;
import java.util.*;
public class p261_pangramString {
    static boolean checkPangram(String pangramString){
        int sizeOfPangramString = pangramString.length();
        boolean[] check = new boolean[26];
        for(int i = 0; i<sizeOfPangramString;i++){
            char currentLetter = pangramString.charAt(i);

            if(currentLetter >= 'a' && currentLetter <= 'z'){
                check[currentLetter - 'a'] = true;
            }
            if(currentLetter >= 'A' && currentLetter <= 'Z'){
                check[currentLetter - 'A'] = true;
            }
        }
        for(int i = 0; i < check.length;i++){
        if(check[i] ==  false){
        return false;
        }
        }
        return true;


    }
    public static void main(String[] args){
        // so basically pangram means to check weather a string consists of letters from a-z
        //lets go <3
        Scanner input = new Scanner(System.in);
        System.out.println("Please the string in which you wanna check weather it is a pangram or not!");
        String userStringInput = input.nextLine();
        System.out.println(checkPangram(userStringInput));
    }
}
