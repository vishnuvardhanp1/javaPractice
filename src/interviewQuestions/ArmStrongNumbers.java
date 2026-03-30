/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class ArmStrongNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=153;
    int sum = 0 ;
     while(num != 0) {
    	 int digit=num%10;
    	 sum=sum+(digit*digit*digit);
    	 num=num%10;
     }
     
     if(sum == num ) {
    	 System.out.println("The number is armstrong number");
     } else {
    	 System.out.println("The number is not a armstrong number");
     }
	}

}
