/**
 * 
 */
package day6;

/**
 * 
 */
public class Program1_Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			
			System.out.print(i+ " ");
		}
		System.out.println("\nBye");
	}

}
