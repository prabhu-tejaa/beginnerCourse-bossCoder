package bossCoderProblems.twoDArrays;
import java.util.*;
public class p373_transposeMatrix {
    /* 
     Given a 2D integer array matrix, return the transpose of matrix.
    The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
    
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    */

    public static void main(String[] args) {

        // this question was asked in meta and bloomberg

        Scanner sc = new Scanner(System.in);

        // Step 1: Take the number of rows and columns from the user
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Create the 2D matrix (list of lists)
        List<List<Integer>> input = new ArrayList<>();

        // Step 3: Take the matrix values from the user
        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at row " + (i+1) + ", column " + (j+1) + ": "); 
                row.add(sc.nextInt());
            }
            input.add(row);
        }
        System.out.println("Input is = " + input);
        List<List<Integer>> transposeMatrix = new ArrayList<>();
        int sizeOfInput = input.size();
        int numberOfElementsInTheColoum = input.get(0).size();
        for(int i = 0;i<numberOfElementsInTheColoum;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<sizeOfInput;j++){
                row.add(input.get(j).get(i));
            }
            transposeMatrix.add(row);
        }
    System.out.println("transposed matrix is = "+transposeMatrix);
    }
}
