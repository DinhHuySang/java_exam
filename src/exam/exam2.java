/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @author leo
 *
 */
public class exam2 {
	
	// Compare increase of column[location]
	public static void sorted_colums(int[][] array, int rows, int cols, int location) {
		for (int i = 0; i < rows - 1; i++) {
			for (int j = i+1; j < rows; j++) {
				if (array[i][location] > array[j][location]) {
					for (int k = 0; k < cols; k++) {
						int temp = array[i][k];
						array[i][k] = array[i + 1][k];
						array[i + 1][k] = temp;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
//		Input the matrix
		Scanner obj = new Scanner(System.in);
		System.out.print("input row_nums of matrix = ");
		int row = obj.nextInt();
		System.out.print("input col_nums of matrix = ");
		int col = obj.nextInt();
		System.out.print("input location of column need sort = ");
		int local = obj.nextInt();
		
//		show original matrix
		int[][] arr2D = Ultils.Array2D.gen_Arr2D(row, col);
		System.out.println("original matrix: ");
		Ultils.Array2D.show_Arr2D(arr2D);
		exam2.sorted_colums(arr2D,row, col, local);
		System.out.println("sorted matrix: ");
		Ultils.Array2D.show_Arr2D(arr2D);
		
		
	}
	
}
