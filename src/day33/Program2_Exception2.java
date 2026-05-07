/**
 * 
 */
package day33;

/**
 * 
 */
public class Program2_Exception2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=10/0;
				int arr[]= {10,20,30,40};
				try {
				System.out.println("hello");
				int num=10/0;
				System.out.println(arr[10]);
				System.out.println("bye");
				} catch(ArrayIndexOutOfBoundsException ex) {
					System.out.println("Index out of bounds Exception Occured" + ex.getMessage());
				} catch(Exception ex) {
					System.out.println("Exception Occured" + ex.getMessage());
				}
	}

}
