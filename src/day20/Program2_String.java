/**
 * 
 */
package day20;

/**
 * 
 */
public class Program2_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //String is immutable in java
		String str="hello";
		System.out.println(str);
		
		String str2=str.concat(" bye");
		str=str2;
		System.out.println(str2);
		System.out.println(str);
	}

}
