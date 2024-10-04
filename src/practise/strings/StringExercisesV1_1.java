package practise.strings;

public class StringExercisesV1_1 {
    public static void main(String[] args) {
        /*
        The question here is reverse a string...
        - we are given a string and we have to reverse it.
        - "Hello world" -> "world Hello"
        - so how do you think we can do this....
        -  actually thought to break the string and after that I was blank so I have checked the code to think.
        - After seeing the code, here's how we will approach
        - first declare word and result String.
        - In word we will store each word and in result we will add up the words so it will look in reverse way.
        - now first after declaring the string, let loop thru whole of the string and lets collect each character.
        - if the character is not having any spaces then add the words to the word variable - and if you encounter any spaces,
            then in result you add word + "" + result; and then reset the word.
        - then you return the string in the end it should be in reverse.
        - so basically you are taking a string, looking through it and then collecting each character and storing in a word and then
            you keep add that word to the result. So that's how your making it look reverse.
         */

        // chalo lets code it out

        String realString = "Prabhu Teja Pamula loves Bhavana Kunigal";
        int sizeOfRealString = realString.length();
        String words = "";
        String reversedString = "";

        for(int i = 0; i< sizeOfRealString;i++){
            char currentWord = realString.charAt(i);
            if(currentWord != ' '){
                words += currentWord;
            } else {
                reversedString = words + " " + reversedString;
                words = "";
            }
        }
        reversedString = words + " " + reversedString;
        System.out.println(reversedString.trim());
    }
}
