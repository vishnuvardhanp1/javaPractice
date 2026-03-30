/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class ReversingANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=12345;
       int reverse=0;
       for(;num != 0;) {
    	   int lastDigit = num%10;
    	   reverse=reverse*10+lastDigit;
    	   num=num/10;
    	   
       }
       System.out.println("Reverse of number : " + reverse);
       while(num > 0) {
    	   int lastDigit = num%10;
    	   reverse=reverse*10+lastDigit;
    	   num=num/10;  
       }
       System.out.println("Reverse of number : " + reverse);
	}

}
