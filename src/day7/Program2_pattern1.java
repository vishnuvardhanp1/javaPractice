/**
 * 
 */
package day7;

/**
 * 
 */
public class Program2_pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("***");
		}
		System.out.println("-----------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	}

}
