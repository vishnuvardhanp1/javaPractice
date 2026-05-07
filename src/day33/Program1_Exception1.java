/**
 * 
 */
package day33;

/**
 * 
 */
public class Program1_Exception1 {

	/**
	 * Checked Exception
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		Thread.sleep(1000);
	 } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("Exception occured" + e.getMessage());
	 }
	}

}
