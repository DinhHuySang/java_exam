/**
 * 
 */
package exam;
import java.util.Scanner;


/**
 * @author leo
 *
 */
public class exam1 {
	
	static void sort_Array2D(int[][] arr2D, int row, int col)
    {
  
        // Number of elements in matrix
        int size = row * col;
  
        // Loop to sort the matrix
        // using Bubble Sort
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size - 1; j++) 
            {
  
                // Condition to check
                // if the Adjacent elements
                if (arr2D[j / col][j % col] > arr2D[(j + 1) 
                    / col][(j + 1) % col])
                {
  
                    // Swap if previous value is greater
                    int temp = arr2D[j / col][j % col];
                    arr2D[j / col][j % col] = arr2D[(j + 1) 
                        / col][(j + 1) % col];
                    arr2D[(j + 1) / col][(j + 1) % col] = temp;
                }
            }
        }
    }
	
	public static void main(String[] arg) {
		
//		Input the matrix
		Scanner obj = new Scanner(System.in);
		System.out.print("input row_nums of matrix = ");
		int row = obj.nextInt();
		System.out.print("input col_nums of matrix = ");
		int col = obj.nextInt();
		
//		show original matrix
		int[][] arr2D = Ultils.Array2D.gen_Arr2D(row, col);
		System.out.println("original matrix: ");
		Ultils.Array2D.show_Arr2D(arr2D);
		
//		show sorted matrix
		exam1.sort_Array2D(arr2D, row, col);
		System.out.println("sorted matrix: ");
		Ultils.Array2D.show_Arr2D(arr2D);
	}
}
