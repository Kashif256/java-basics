package JavaBasics;

public class TwoDimensional {
    // Two dimensional array 
    // A two-dimensional (2D) array is an array of arrays. It stores data in rows and columns, just like a table or an Excel spreadsheet.
    public static void main(String[] args) {
        String x[][] = new String [3][5];

        System.out.println(x.length);  // in this case if we use command as x.length it gives only the row part 
        System.out.println(x[0].length); // it will give the coloumn value

        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "12";
        x[0][3] = "13";
        x[0][4] = "14";
        x[1][0] = "C";
        x[1][1] = "D";
        x[1][2] = "12";
        x[1][3] = "13";
        x[1][4] = "14";
        x[2][0] = "E";
        x[2][1] = "F";
        x[2][2] = "12";
        x[2][3] = "13";
        x[2][4] = "14";

       /* System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);
        System.out.println(x[0][3]);
        System.out.println(x[0][4]);
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
        System.out.println(x[1][3]);
        System.out.println(x[1][4]);
        System.out.println(x[2][0]);
        System.out.println(x[2][1]);
        System.out.println(x[2][2]);
        System.out.println(x[2][3]);
        System.out.println(x[2][4]);  */

        // to avoid lot of writing printing code, we can use the for loop condition to avoid the lot of lines 

        for( int row = 0; row < x.length; row++){ // in this it first check row =0 then it check length till that it will print
            for( int col=0; col<x[0].length; col++){ // same in this also
                System.out.println(x[row][col]); // in this it print the x[row] and [column] 
            }
        }

    }
}
