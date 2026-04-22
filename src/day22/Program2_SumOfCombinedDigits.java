/**
 * 
 */
package day22;

/**
 * 
 */
public class Program2_SumOfCombinedDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="ABCD123E5";
    String temp="";
    int sum=0;
    
    for(int i=0;i<=str.length()-1;i++) {
    	char ch=str.charAt(i);
    	if(Character.isDigit(ch)) {
    		temp += ch;
    	}
    	else {
    		if(!temp.isEmpty()) {
    		sum +=Integer.parseInt(temp);
    		temp="";
    		}
    		
    	}
    }
   if(!temp.isEmpty()) {
    sum+=Integer.parseInt(temp);
   
    }
    System.out.println(sum);
    
	}

}
