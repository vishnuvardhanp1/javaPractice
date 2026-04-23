/**
 * 
 */
package day23;

/**
 * 
 */
public class Program4_Stringbuffer {

	/**
	 * @param argsString builder is not thread safe,stringbuffer is threadsafe
	 * one thread is using space
	 * other threads cannot intervene
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		   String str="today is a warm day";
		   String words[]=str.split(" ");
		   StringBuffer temp=new StringBuffer("");
		   
		   for(String word:words) {
			   StringBuffer sb=new StringBuffer(word);
			   temp.append(" "+ sb.reverse());
		   }
		   
		   System.out.println(temp.toString().trim());
			

	}

}
