/**
 * 
 */
package day10;

/**
 * 
 */
public class Program3_TwoDimesnionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][]= {{98,97,93},{78,86,89},{87,89,95}};
		for(int row=0;row <=2 ;row ++) {
			for(int col=0;col<=2;col++) {
			System.out.print(marks[row][col] +  " ");	
			
			System.out.println();
			}
			System.out.println("----------");
		}
		System.out.println("**************");
       //
		int marks1[][]= {{98,97,93},{78,86,89},{87,89,95},{99,100,98}};
		for(int row=0;row <=marks1.length-1 ;row ++) {
			for(int col=0;col<=marks1[row].length-1;col++) {
			System.out.print(marks1[row][col] +  " ");	
			
			System.out.println();
			}
			System.out.println("----------");
		}
	}

}
