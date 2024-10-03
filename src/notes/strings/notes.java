package notes.strings;

public class notes {
    public static void main(String[] args){

        // so what are strings

/*      In Java, a String is an object that represents a sequence of characters.
        String is a reference type, data type
        Strings are immutable
        Immutability: When you modify a string, a new object is created rather than altering the original.
        For example, if String str = "Hello"; is assigned, the value "Hello" is placed in the string pool. If you later "modify" str, like str = str + " World";, a new string "Hello World" is created, and the variable str now points to this new string, while the original "Hello" remains unchanged.
        It remains in memory until it is no longer referenced by any part of the program. Once there are no references pointing to the original string, it becomes eligible for garbage collection.

        String Pool: Java maintains a pool of strings to optimize memory usage. If two strings have the same value, they can refer to the same object in the pool.

        Common Methods: The String class provides many methods, such as:
        length(): Returns the length of the string.
        charAt(int index): Returns the character at the specified index.
        substring(int beginIndex, int endIndex): Extracts a portion of the string.
        equals(Object obj): Checks if two strings are equal.
        compareTo(String anotherString): Compares two strings lexicographically.
        concat(String str): Concatenates two strings.

        String name = "Prabhu Teja"; - this is called string literals
        String lastName = new String("Pamula"); - this is call string objects


*/
        // let me show some examples

        String name = "Prabhu Teja"; // this is called string literals
        String surName = " Pamula";

        // this is how we write the syntax
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.substring(3,11));
        System.out.println(name.equals("Prabhu Teja"));
        System.out.println(name.compareTo("Prabhu Teja"));
        System.out.println(name.concat(surName));

        String number = new String("137");
        System.out.println(number);
    }
}
