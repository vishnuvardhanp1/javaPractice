/**
 * 
 */
package day32;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 */
public class Program2_LinkedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="aaabbccacb";
    char[] letters=str.toCharArray();
    Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
    String newString="";
    for(char alpha:letters) {
    	if(map.containsKey(alpha)) {
    		int value=map.get(alpha);
    		value++;
    		map.put(alpha, value);
    	} else {
    		map.put(alpha, 1);
    	}
    }
    System.out.println(map);
    for(Entry<Character,Integer> entry:map.entrySet()) {
    newString=newString+entry.getKey()+entry.getValue();	
    }
    System.out.println(newString);
	}

}
