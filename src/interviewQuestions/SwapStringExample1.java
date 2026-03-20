/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class SwapStringExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hellowi";
		String str2 = "World!";

		str1 = str1 + str2;  
		// str1 = "HelloWorld"

		str2 = str1.substring(0, str1.length() - str2.length());  
		// str2 = "Hello"

		str1 = str1.substring(str2.length());  
		// str1 = "World"

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}

}
