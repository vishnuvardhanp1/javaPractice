/**
 * 
 */
package day21;

/**
 * 
 */
public class Program2_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="madam";
    String rev="";
    //str=str.toLowerCase();
    for(int i=str.length()-1;i >= 0;i--) {
    	rev=rev+str.charAt(i);
    	
    }
    if(rev.equals(str))
    	System.out.println("String is Palindrome");
    else
    	System.out.println("String is not Palindrome");
	}

}
