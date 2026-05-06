/**
 * 
 */
package day32;

/**
 * 
 */
public class Program4_Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num=10/0;
		int arr[]= {10,20,30,40};
		try {
		System.out.println("hello");
		System.out.println(arr[10]);
		System.out.println("bye");
		} catch(Exception ex) {
			System.out.println("Exception Occured" + ex.getMessage());
		}
		
	}

}
