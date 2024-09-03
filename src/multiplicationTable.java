import java.util.*;
public class multiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for which you want multiplication table - ");
        int value = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(value + " x " + i + " = " + (value*i));
        }
    }
}
