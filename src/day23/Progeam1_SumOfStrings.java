/**
 * 
 */
package day23;

/**
 * 
 */
public class Progeam1_SumOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD123E5";
	    String temp="0";
	    int sum=0;
	    
	    for(int i=0;i<=str.length()-1;i++) {
	    	char ch=str.charAt(i);
	    	if(Character.isDigit(ch)) {
	    		temp += ch;
	    	}
	    	else {
	    		
	    		sum +=Integer.parseInt(temp);
	    		temp="0";
	    		
	    		
	    	}
	    }
	
	    sum+=Integer.parseInt(temp);
	   
	   
	    System.out.println(sum);
	    
	}

}
