/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class SwapNumbersXOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10,b=20;
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("The A is " + a);
	System.out.println("The B is " + b);
	}

}
