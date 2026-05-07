/**
 * 
 */
package day33;

/**
 * 
 */
public class Program6_SystemExit {

	/**
	 * finally wont execute
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			 int num=10/0;	
			 System.out.println("Bye");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.exit(0);
		} finally {
			System.out.println("I will always execute");
		}
	}

}
