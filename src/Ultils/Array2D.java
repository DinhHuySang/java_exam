package Ultils;

public class Array2D {
	
	public static int[][] gen_Arr2D(int row, int col){
		int[][] arr2D = new int[row][col];
		for(int i=0; i<row; i++) {
			arr2D[i] = Array1D.gen_Arr1D(col);
		}
		return arr2D;
	}
	
	public static void show_Arr2D(int[][] arr2D){
		for(int[] v: arr2D) {
			Array1D.show_Arr1D(v);
			System.out.println();
		}
	}
}
