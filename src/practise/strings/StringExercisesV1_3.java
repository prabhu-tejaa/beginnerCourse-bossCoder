package practise.strings;

import java.util.Arrays;

public class StringExercisesV1_3 {
/*
    - this problem is anagram
    - so what does it mean
    - it means that two string should have letters but will be in a different way
    - example: string1 = "silent"; string2 = "listen" -> this is an anagram
    - so how to do this??
    - can I even think about is??
    - from my thinking we shall first check if the size is same and return false if not.
    - That's all I can think
    - now I will go check the problem and come
    - na Im taking a break see you later time 11: am
    - I slept and woke up just now and time is 3:15 pm
    - 4 hours 15 min gone in vain
    - ok now let's go to the problem

    - At first we are checking if the size of the first given string and second give string is same, if it is then return true or else false.
    - the provided answer in the code is taking with the length of 26. Why 26? because we have 26 alphabets.
    - then its iterating with the size of the string and then incrementing each array at their specific char number
    - and in the end we are check if first array != seconds array then return false, else true.

    - so basically we are storing the increments of a given string in an arrays of alphabetic size and checking if both are same. That's how we're able to find it out
    chalo buddy lets code
 */

    public static void main(String[] args) {
        String stringOne = "silent";
        String stringTwo = "LISTEN";
        if(stringOne.length() != stringTwo.length()){
            System.out.println("its not an anagram");
        }

        int[] arrayOne = new int[26];
        int[] arrayTwo = new int[26];

        for(int i = 0; i<stringOne.length();i++){
            char currentWordOfStringOne = stringOne.charAt(i);
            char currentWordOfStringTwo = stringTwo.charAt(i);
            if(currentWordOfStringOne >= 'a' && currentWordOfStringOne <= 'z'){
            arrayOne[currentWordOfStringOne - 'a']++;
            }
            if(currentWordOfStringTwo >= 'a' && currentWordOfStringTwo <= 'z') {
            arrayTwo[currentWordOfStringTwo - 'a']++;
            }
            if(currentWordOfStringOne >= 'A' && currentWordOfStringOne <= 'Z'){
                arrayOne[currentWordOfStringOne - 'A']++;
            }
            if(currentWordOfStringTwo >= 'A' && currentWordOfStringTwo <= 'Z'){
                arrayOne[currentWordOfStringTwo - 'A']++;
            }
        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        for(int i = 0; i < 26; i++){
            if(arrayOne[i] != arrayTwo[i]){
                System.out.println("Not anagram" + i);
            } else {
                System.out.println("Anagram" + i);
            }
        }

    }
}
