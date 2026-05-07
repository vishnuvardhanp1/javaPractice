/**
 * 
 */
package day33;

/**
 * 
 */
public class Program4_CustomException2 {

	/**
	 * @param args
	 * @throws NegativeException 
	 */
	public static void main(String[] args) throws NegativeException {
		// TODO Auto-generated method stub
    int num=-2;
    try {
    if(num <0)
    	throw new NegativeException("Less than 0 is not allowed");
	
	}catch(Exception ex) {
		System.out.println("Exception Occured : " + ex.getMessage());
	}
	}

}
