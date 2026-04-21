/**
 * 
 */
package day21;

/**
 * 
 */
public class Program1_Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String 	str="today is tuEsday";
		// TODO Auto-generated method stub
	int vowelCount=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length()-1;i++) {
	 char ch=str.charAt(i);
	 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		vowelCount++;
	 
	 
	}
	System.out.println("Count of vowels " + vowelCount);
	}

}
