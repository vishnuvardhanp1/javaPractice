/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class PrimeNumberProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=37;boolean isNotPrime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isNotPrime=true;
				break;
			}
		}
		if(isNotPrime) 
			System.out.println("It is not a prime");
			else
				System.out.println("It is prime");
		
		int num1=36;
		for(int i=2;i<num1;i++) {
			while(num1%i==0) {
				System.out.println(i+" ");
				num1=num1/i;
			}
		}
		
	}

}
