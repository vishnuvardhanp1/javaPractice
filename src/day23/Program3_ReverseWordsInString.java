/**
 * 
 */
package day23;

/**
 * 
 */
public class Program3_ReverseWordsInString {

	/**
	 * @param args
	 * 
	 * String is immutable,stringbuilder is mutable
	 * string doesnot have reverse method,stringbuilder have reverse method
	 * both are not thread safe
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="today is a warm day";
   String words[]=str.split(" ");
   StringBuilder temp=new StringBuilder("");
   
   for(String word:words) {
	   StringBuilder sb=new StringBuilder(word);
	   temp.append(" "+ sb.reverse());
   }
   
   System.out.println(temp.toString().trim());
	}

}
