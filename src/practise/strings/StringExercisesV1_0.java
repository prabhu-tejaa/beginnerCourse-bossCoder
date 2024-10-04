package practise.strings;

public class StringExercisesV1_0 {

    /*
    261. Pangram String

    Check if given String is Pangram or not
    Note : A pangram is a sentence containing every letter in the English Alphabet.

    Input 1: “The quick brown fox jumps over the lazy dog”
    Output 1: true
    Explanation 1: Contains all the characters from ‘a’ to ‘z’
    Constraints:
    1 <= str.length <= 105
     */

    /*
    soo here's how we'' think and solve the problem:
    - first thing real the problem first
    - so its saying check if a given string is pangram, that means all letters much contains in the given string.
    - so now what do you think about it, how will you think it
    - should I store a to z and iterate through the string and then count++ when there is an alphabet.
        but the problem here is what if there are same letter twice??
        so think... first thing how do we iterate through a string tho??

     - so the approach I would like to give is:
     . first create a boolean array where you want to store all the letters from the given string.
     . get to know the size of your string.
     . iterate through the string and capture the character.
     . once you capture single one, add that to the boolean array you have created.
     . here the logic would, we should check for both upper and lower case letters in the array so
     . one if condition for lower case a to z and one if condition for uppercase A to B.
     . then inside if condition add the boolean to the boolean array.
     . then again loop through and find out if the array is having false or true of full alphabets

     */

    // iterating thru a loop
//    String myName = "Prabhu teja";
//    int nameLength = myName.length();
//    for(int i = 0;i < myName.length(); i++){
//        char ch = myName.charAt(i);
//        System.out.println(ch);
//    }
    static boolean pangramCheck(String pangram){
        boolean[] check = new boolean[26];
        int sizeOfPangram = pangram.length();

        for(int i = 0; i<sizeOfPangram;i++){
            char string = pangram.charAt(i);
            if(string >= 'a' && string <= 'z'){
                check[string-'a'] = true;
            }
            if(string >= 'A' && string <= 'Z'){
                check[string-'A'] = true;
            }
        }
        for(int i = 0; i<26; i++){
            if(check[i] == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pangram = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangramCheck(pangram));
    }
}
