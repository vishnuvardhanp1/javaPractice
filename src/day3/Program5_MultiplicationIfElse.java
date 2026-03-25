/**
 * 
 */
package day3;

/**
 * 
 */
public class Program5_MultiplicationIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiple=2;
		while(multiple <= 30) {
			if(multiple%10==0) {
				System.out.println("Bye");	
			}
			else if(multiple%3==0) {
				System.out.println("Hello");	
			}
			else {
			System.out.println(multiple);
			}
			
			multiple=multiple+2;
		}

	}

}
