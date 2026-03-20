/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class SwapNumbersExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40,b=50;
		//b=b-a;
		//a=a+b;
		//a=a+b-a;
		//b=b-a;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The A is " + a);
		System.out.println("The B is " + b);
		

	}

}
