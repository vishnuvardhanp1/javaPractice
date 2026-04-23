/**
 * 
 */
package day23;

/**
 * 
 */
public class Program_StringOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str1="hello";
    String str2="hello";
    String str3=new String("hello");
    String str4=new String("hello"); 
    
    System.out.println(str1== str2);
    System.out.println(str1.equals(str2));
   
    System.out.println(str3.equals(str4));
    System.out.println(str3== str4);
    
    if(str1 == str2)
    	System.out.println("Output1");
    if(str1.equals(str2))
    	System.out.println("Output2");
    if(str3.equals(str4))
    	System.out.println("Output3");
    //this wont print because memory address is not same
    if(str3==str4)
    	System.out.println("Output4");
	}

}
