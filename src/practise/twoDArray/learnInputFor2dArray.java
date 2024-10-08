package practise.twoDArray;
import java.util.*;
public class learnInputFor2dArray {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows you want: " );
    int rows = input.nextInt();
    System.out.print("Entet numbers of coloums you want: ");
    int columns = input.nextInt();
    List<List<Integer>> twoDArray = new ArrayList<>();
    for(int i = 0;i<rows;i++){
        List<Integer> allRows = new ArrayList<>();
        for(int j = 0; j<columns;j++){
            System.out.print("Enter element at row " + (i+1) + ", column " + (j+1) + ": ");
            allRows.add(input.nextInt());
        }
        twoDArray.add(allRows);
    }
    System.out.println(twoDArray);
}    
}
