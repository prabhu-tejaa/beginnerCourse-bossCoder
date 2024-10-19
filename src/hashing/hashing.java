package hashing;
import java.util.*;
public class hashing {
    public static void main(String[] args) {

        /*
        HashMap, store items in "key/value" pairs
        One object is used as a key (index) to another object (value). It can store different types: String keys and
        Integer values, or the same type, like: String keys and String values or Integer keys and Integer values
        syntax:
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        HashMap<Integer, Integer> zipCodes = new HashMap<Integer, Integer>();
        The HashMap class has many useful methods. For example, to add items to it, use the put(), To access a value
        in the HashMap, use the get(), To remove an item, use the remove(), To find out how many items there are, use the size()
        The getOrDefault() method returns the value of the entry in the map which has a specified key. If the entry does
        not exist then the value of the second parameter is returned.
        Syntax: public V get(Object key, V def)

        we have two hashmap and treemap.


        hashmap is unordered and time complexity is O(1) but in worst case due to collision it can be O(n)
        tree map is ordered and time complexity is O(log n)
         */

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Prabhu", 1);
        hashMap.put("Teja", 3);
        hashMap.put("Pamula", 7);
        System.out.println("Hash Map values are: "+hashMap);
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Pamula", 1);
        treeMap.put("Teja",3);
        treeMap.put("Prabhu",7);
        System.out.println("The tree map values are: "+treeMap);
        HashMap<Integer, Integer> hashMapInteger = new HashMap<>();
        hashMapInteger.put(7,1);
        hashMapInteger.put(3,3);
        hashMapInteger.put(1,7);
        System.out.println(hashMapInteger);
        System.out.println(hashMapInteger.get(7));
        System.out.println(hashMapInteger.containsValue(7));
        System.out.println(hashMapInteger.size());
        System.out.println(hashMapInteger.containsKey(7));
        System.out.println(hashMapInteger.getOrDefault(37, 121));
        System.out.println(hashMapInteger);
        TreeMap<Integer,Integer> treeMapInteger = new TreeMap<>();
        System.out.println(treeMapInteger.isEmpty());
        System.out.println(treeMapInteger.size());
        }
}
