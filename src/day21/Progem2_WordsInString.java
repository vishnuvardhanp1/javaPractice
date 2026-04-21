/**
 * 
 */
package day21;

/**
 * 
 */
public class Progem2_WordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="today is a warm day";
    String words[]=str.split(" ");
    int numberOfWords=words.length;
    System.out.println("Number of words" + numberOfWords);
    int spaces=0;
    for(int i=0;i<str.length()-1;i++) {
    	char ch=str.charAt(i);
    	if(ch == ' ' )
    	spaces++;	
    }
    System.out.println("number of words" + (spaces+1));
	}

}
