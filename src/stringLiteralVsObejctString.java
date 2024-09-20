public class stringLiteralVsObejctString {
    public static void main(String[] args){
        String name = "Prabhu Teja";
        String myName = "Prabhu Teja";

        //String literals... Now we are checking if the memory allocation for the staring is the same constant
        if(name == myName){
            System.out.println("Both name and myname point of you same literals");
        } else {
            System.out.println("Both name and mYname point out to different literals");
        }


        //String object... Now we are checking if the string object is point out to same object in memory or a new one.

        String lastName = new String("Pamula");
        String mYLastName = new String("Pamula");

        if(lastName == mYLastName){
            System.out.println("Both lastName and myLastName point out to same object");
        } else {
            System.out.println("Both lastName and myLastName point out to a different object");
        }

        //learning/testing
        String test = "he";
        System.out.println(test.charAt(0));
        System.out.println(test.length());

        boolean attendance[] = new boolean[26];
        System.out.println(attendance[25]);

    }
}
