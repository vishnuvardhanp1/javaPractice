/**
 * 
 */
package day6;

/**
 * 
 */
public class Program2_ContinueWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int i=0;
		while(i<=9){
			i++;
			if(i==5) {
				continue;
			}
			
			System.out.print(i+ " ");
			
		}
		System.out.println("\nBye");
	}

}
