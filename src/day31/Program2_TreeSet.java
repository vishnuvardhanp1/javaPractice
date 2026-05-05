/**
 * 
 */
package day31;


import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public class Program2_TreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="the day today is a very very very warm day";
		    String words[]=str.split(" ");
		    Set<String> set=new TreeSet<String>();
		    String newString="";
		    for(String word:words) {
		    	set.add(word);
		    }
		    for(String data:set) {
		    	newString=newString+data+" ";
		    }
		    System.out.println(newString.trim());
	}

}
