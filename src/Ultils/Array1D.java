/**
 * 
 */
package Ultils;

/**
 * @author leo
 *
 */
public class Array1D {
	public static int gen_Int() {
		return (int)(Math.random()*100);
	}
	
	public static int[] gen_Arr1D(int n){
		int[] arr1D = new int[n];
		for(int i=0; i<n; i++) {
			arr1D[i] = Array1D.gen_Int();
		}
		return arr1D;
	}
	
	
	public static void show_Arr1D(int[] arr1D) {
		for(int v:arr1D) { 
			System.out.print(v+"  ");
		}
	}
}
