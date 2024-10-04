package practise.strings;

public class StringExercisesV1_2 {
    /*
    Palindrome String
    - so now the question is same as for array, palindrome..
    - that means even if you do it opposite it should look the same
    - abcd ->dcba
    - so let's think how we can do this..
    - Do i remember how I did it array?? nopeeeeeeee
    - ok lets go and check the array solution and come back and see if any original thoughts come up
    - it seems like even after I looked at the code of array one which I have done, I am not able to recognize the flow.
    - ok I will go to the real code of strings and come back and then we will analyse.
    - its soooo crazy, I've just looked at the code and after seeing th logic, I feel oh only this muchh ahh and im in shock
    - so this is how it goes
    - first we take variables left as 0 and right as the length of the given string - 1
    - then we do a loop till left < right
    -  in the loop we check if the string of left char is != string of right char.
    - if the if condition pass then we return false and if not return true;
     */

    // chalo lets code

    public static void main(String[] args) {
    String palindromeString = new String("abcba");
        int left = 0;
        int right = palindromeString.length() - 1;
        while(left < right){
            if(palindromeString.charAt(left) != palindromeString.charAt(right)){
                System.out.println("It is not a palindrome");
            } else {
                System.out.println("It is a palindrome");
            }
            left++;
            right--;
        }
    }

}
