/**
 * 
 */
package day2;

/**
 * 
 */
public class Program7_NestedIF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18; char gender = 'F';
	      if(age==18) {
	    	  System.out.println("Congrats on your first vote");
	    	  if(gender == 'F') {
	    		  System.out.println("Please vote girl"); 
	    	  } else {
	    		  System.out.println("Please vote boy");  
	    	  }
	      }
	      if(age>=18) {
	    	  System.out.println("You can vote");
	      }
	      else {
	    	  System.out.println("You cannot vote");
	      }
	}

}
