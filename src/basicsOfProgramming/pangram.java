package basicsOfProgramming;

public class pangram {
    public static void main(String[] args){
        //A basicsOfProgramming.pangram is a sentence that contains every letter of the alphabet at least once
        Character test= 'a';
        Character test1= 'z';
        System.out.println("When we subtract charcters by ASICII values" + (test1-test));
        String pangram = "abcdefghijklmnopqrstuvwxyz";
        int stringSize = pangram.length();
        boolean[] check = new boolean[26];
        boolean result = false;
        for(int i = 0; i < stringSize; i++){
            check[pangram.charAt(i) - 'a'] = true;
        }
        for(int i = 0; i < 26; i++){
            if(check[i] == false){
                result = false;
                break;
            } else {
                result = true;
            }
        }
        System.out.println("The given input \"" + pangram + "\" is a basicsOfProgramming.pangram: " + result);
    }
}
