package S05Ex03;

public class MatrixTest {

    public static void main(String[] args){
        
        // Test readMatrix and printMatrix
        int[][] matrix1 = MatrixOperations.readMatrixFromString( // read from String
            "11 2 3 5\n" +
            "4 5 6 5\n" +
            "7 87 8 5\n" +
            "1 2 3 4");
        int[][] matrix2 = MatrixOperations.readMatrix( // read from file
            "C:\\Programming\\java_projects\\24_IN_P1\\P1_serie05\\src\\S05Ex03\\testMatrix.txt");
        MatrixOperations.printMatrix(matrix1);
        MatrixOperations.printMatrix(matrix2);
        
        // Test transpose
        MatrixOperations.printMatrix(MatrixOperations.transpose(matrix1)); // transposed square size matrix
        System.out.println(MatrixOperations.transpose(matrix2)); // should return null (not square size matrix)
        System.out.println();
        
        // Test product
        int [][] matrix3 = MatrixOperations.readMatrixFromString(
            "1 2\n" +
            "3 4\n" +
            "5 6");
        int [][] matrix4 = MatrixOperations.readMatrixFromString(
            "1 2 3\n" +
            "4 5 6\n");
        
        MatrixOperations.printMatrix(MatrixOperations.product(matrix3, matrix4));
        System.out.println(MatrixOperations.product(matrix1, matrix2)); // should return null
    }

}
