/**
 * 
 */
package day33;

/**
 * custom exceptions
 */
public class Program3_CustomException {
	
	static void checkAge(int age) throws Exception {
	if(age<18)
		throw new Exception(" Under age ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   System.out.println("Hello");
		checkAge(16);
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Exception Occured : " + e.getMessage());
	   }
	}

}
