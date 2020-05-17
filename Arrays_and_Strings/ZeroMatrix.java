import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		System.out.println("Before: ");
		for(int i = 0; i < matrix.length; i++)
			System.out.println(Arrays.toString(matrix[i]));
		zeroMatrix(matrix);
		System.out.println("After: ");
		for(int i = 0; i < matrix.length; i++)
			System.out.println(Arrays.toString(matrix[i]));
	}
	
	private static void zeroMatrix(int[][] matrix) {
		boolean hasRowZero = false;
		boolean hasColumnZero = false;
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		// Check if first row contains zero
		for(int j = 0; j < columns; j++)	{
			if(matrix[0][j] == 0)	{
				hasRowZero = true;
				break;
			}
		}
		
		// Check if first column contains zero
		for(int i = 0; i < rows; i++) {
			if(matrix[i][0] == 0) {
				hasColumnZero = true;
				break;
			}
		}
		
		// Check remaining values
		for(int i = 1; i < rows; i++) {
			for(int j = 1; j < columns; j++)	{
				if(matrix[i][j] == 0)	{
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		// Nullify the rows
		for(int row = 1; row < rows; row++)	{
			if(matrix[row][0] == 0) {
				nullifyRow(matrix, row);
			}
		}
		
		// Nullify the columns
		for(int column = 1; column < columns; column++)	{
			if(matrix[0][column] == 0)	{
				nullifyColumn(matrix, column);
			}
		}
		
		// Check for the first row and the first column
		if(hasRowZero)	nullifyRow(matrix, 0);
		if(hasColumnZero) nullifyColumn(matrix, 0);
	}
	
	private static void nullifyRow(int[][] matrix, int row)	{
		for(int j = 0; j < matrix[0].length; j++)	{
			matrix[row][j] = 0;
		}
	}
	
	private static void nullifyColumn(int[][] matrix, int column)	{
		for(int i = 0; i < matrix.length; i++)	{
			matrix[i][column] = 0;
		}
	}

}
