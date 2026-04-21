/**
 * 
 */
package day21;

/**
 * 
 */
public class Program4_CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="today is tuesday";
    String words[]=str.split(" ");
    String camelCase="";
    String result=words[0];
    
    for(int i=1;i<words.length;i++) {
    	result += words[i].substring(0,1).toUpperCase()
    			+ words[i].substring(1);
    }
    System.out.println(result);
    int index=0;
    for(String s:words) {
    	String upperAlpha="";
    	if(index != 0) {
    		char firstAlpha=s.charAt(0);
        	upperAlpha=(firstAlpha+"").toUpperCase();	
    	} else {
    		
    	
    	
    	upperAlpha=s.charAt(0)+"";
    	}
    	camelCase=camelCase+upperAlpha+s.substring(1,s.length());
    	index++;
    	
    }
    System.out.println(camelCase);
	}

}
