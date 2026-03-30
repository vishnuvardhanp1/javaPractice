/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class LargestOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=30,b=20,c=40;
      if(a>b && a>c) {
    	  System.out.println("A is greater number " + a);
    	  
      } else if(b>c && b>a) {
    	  System.out.println("B is greater number " + b);  
      } else {
    	  System.out.println("C is greater number " + c);
      }
      
	}

}
