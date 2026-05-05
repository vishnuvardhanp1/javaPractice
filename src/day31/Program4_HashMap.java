/**
 * 
 */
package day31;
import java.util.*;
import java.util.Map.Entry;

/**
 * 
 */
public class Program4_HashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer,String> map=new HashMap<Integer,String>();
     map.put(1, "A");
     map.put(10, "B");
     map.put(2, "C");
     map.put(30, "D");
     map.put(49, "E");
     map.put(5, "F");
     map.put(5, "G");
     
     System.out.println(map.get(1));
     System.out.println(map.containsKey(99));
     map.remove(10);
     
     for(Entry<Integer,String> entry :map.entrySet()) {
    	 System.out.println(entry.getKey() + " " + entry.getValue());
     }
     
     // the day today is a very very very warm day
     // how many words count for each word
     // the =1 day=2
     
     //aaabbcc
     //a3b2c1
     
	}

}
