package S05Ex03;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class MatrixOperations {

    public static int[][] readMatrixFromString(String file){

        // Read file and store lines in ArrayList
        ArrayList<String> lines = new ArrayList<String>();
        Scanner lineScanner = new Scanner(file);
        while(lineScanner.hasNext()){
            String line = lineScanner.nextLine();
            lines.add(line);
        }

        // Determine number of rows and columns
        int numRows = lines.size();
        int numCols = lines.get(0).split(" ").length; // Assuming all rows have the same number of elements
        int[][] matrix = new int[numRows][numCols];

        // Fill matrix with elements
        for(int r=0; r<numRows; r++){
            String lineString = lines.get(r);

            // Use a Scanner to read each element of the line
            Scanner elScanner = new Scanner(lineString);
            int col = 0;
            while(elScanner.hasNext()){
                int el = elScanner.nextInt();
                matrix[r][col] = el;
                col++;
            }
            // for(int col=0; col<numCols; col++){
            //     String el = lineStrArray[col];
            //     lineArray[col] = Integer.parseInt(el);
            // }
        }
        return matrix;
    }

    public static int[][] readMatrix(String filename){
        try{
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            String fileContent = "";
            while(fileScanner.hasNext()){
                fileContent += fileScanner.nextLine() + "\n";
            }
            return readMatrixFromString(fileContent);
        } catch(Exception e){
            System.out.println("Error reading file: " + e);
            return null;
        }
    }

    public static int[][] transpose(int[][] matrixIn){
        int numRows = matrixIn.length;
        int numCols = matrixIn[0].length;
        if (!(numRows==numCols)){
            System.out.println("Matrix needs to be square size.");
            return null;
        }
        int [][] mT = new int[numRows][numRows];
        for(int r=0; r<numRows; r++){
            for(int c=0; c<numRows; c++){
                mT[c][r] = matrixIn[r][c];
            }
        }
        return mT;
    }

    public static int[][] product(int[][] mA, int[][] mB){
        int n = mA.length, m = mA[0].length, rowsB = mB.length, l = mB[0].length;
        if(rowsB != m){
            System.out.println("Error: Number of rows in A needs to be equal to number of columns in B!");
            return null;
        }
        int[][] mOut = new int[n][l];
        for(int r=0; r<n; r++){
            for(int c=0; c<l; c++){
                int val = 0;
                for(int i=0; i<m; i++){
                    val += mA[r][i] * mB[i][c];
                }
                mOut[r][c] = val;
            }
        }
        return mOut;
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int el : row){
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
