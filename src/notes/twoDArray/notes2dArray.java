package notes.twoDArray;

import java.util.*;

public class notes2dArray {
    /*
    A 2D array (two-dimensional array) in Java is an array of arrays, which can be visualized as a matrix or a grid. It allows you to store data in a tabular form, where each element is accessed by two indices: one for the row and one for the column.

    Syntax:
    1st way (static way) -

    int[][] matrix = new int[3][3];
    // Assigning values
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    matrix[2][0] = 7;
    matrix[2][1] = 8;
    matrix[2][2] = 9;

    or

    int[][] staticMatrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };


    2nd way Dynamic matrix using list - 

    List<List<Integer>> tr = new ArrayList<>();
    // Adding the first list [1, 2, 3]
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        tr.add(row1);

        // Adding the second list [4, 5, 6]
        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        tr.add(row2);

        // Adding the third list [7, 8, 9]
        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        tr.add(row3);

     */
    public static void main(String[] args) {
        //static array for 2d array
        int[][] staticMatrix = new int[3][3];
        staticMatrix[0][0] = 1;
        staticMatrix[0][1] = 2;
        staticMatrix[0][2] = 3;
        staticMatrix[1][0] = 4;
        staticMatrix[1][1] = 5;
        staticMatrix[1][2] = 6;
        staticMatrix[2][0] = 7;
        staticMatrix[2][1] = 8;
        staticMatrix[2][2] = 9;
        System.out.println("static array 00 "+Arrays.deepToString(staticMatrix));
        
        // or you can write in -

        int[][] staticMatrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("static array 01 "+Arrays.deepToString(staticMatrix1));

        //static array for dynamic array
        List<List<Integer>> dynamicArray = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        List<Integer> row3 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row2.add(4);
        row2.add(5);
        row2.add(6);
        row3.add(7);
        row3.add(8);
        row3.add(9);
        dynamicArray.add(row1);
        dynamicArray.add(row2);
        dynamicArray.add(row3);
        System.out.println("dynamic array 00 "+dynamicArray);

        // or

        List<List<Integer>> dynamicArray01 = new ArrayList<>();
        dynamicArray01.add(Arrays.asList(1,2,3));
        dynamicArray01.add(Arrays.asList(4,5,6));
        dynamicArray01.add(Arrays.asList(7,8,9));
        System.out.println("dynamic array 01 "+dynamicArray01);
    }

}
