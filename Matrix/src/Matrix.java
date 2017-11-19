
public class Matrix {
	
	// Write a method that prints the 2D array in a nice format with 2 spaces between entries
		// Ex.
		// 2  3  4  5 
		// 5  7  1  8 
		// 6  10  4  7 
	public static void print(int[][] arr)
	{
		
		
	}
	
	//  Write a method that accepts a 2D array of ints and returns void.  It should make all 
	//  the negative numbers in a 2D array positive.
		// Ex.
		//  -1  5  -9   -->  1  5  9 
		//  0  10  -4        0  10  4 
	public static void makePositive(int[][] arr)
	{
	
		
		
	}
	
	// Write a method accepts a 2D array of ints and returns a 2D array of ints. 
	// The new array should have the columns rotated to the RIGHT 1 place.  
	    // Ex.
		// -1  5  -9   -->  -9  -1  5 
		//  0  10  -4       -4  0  10 
	public static int [][] shiftRight(int [][] arr){
		
		return null;
	}
	
	public static void main(String[] args) {
		int [][] matrix1 = {{1, 2, 3, 4},{ -1, -2, -3, -4},{-1, -2, -3, -4}};
		int [][] matrix2 = {{5, -6, -7},{-5, 6, -7},{5, -6, 7},{5, 6, 7},{-5, -6, -7}};
		int [][] matrix3 = {{8, 9, 10, 11, 12, 13},{8, 9, 10, 11, 12, 13},{8, 9, 10, 11, 12, 13}};
		int [][] matrix4 = {{14,  15, 16},{ 16, 15, 14},{14, 15, 16},{16, 15, 14},{14, 15, -16}};
		
		System.out.println("Original matrix1:");
		print(matrix1);
		System.out.println("\nmakePositive matrix1:");
		makePositive(matrix1);
		print(matrix1);
		
		System.out.println("\nOriginal matrix2:");
		print(matrix2);
		System.out.println("\nmakePositive matrix2:");
		makePositive(matrix2);
		print(matrix2);
		
		System.out.println("\n\nOriginal matrix3:");
		print(matrix3);
		System.out.println("\nshiftRight matrix3:");
		print(shiftRight(matrix3));
		
		System.out.println("\nOriginal matrix4:");
		print(matrix4);
		System.out.println("\nshiftRight matrix4:");
		print(shiftRight(matrix4));
	}

}
