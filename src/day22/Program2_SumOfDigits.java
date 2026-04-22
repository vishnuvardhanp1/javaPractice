/**
 * 
 */
package day22;

/**
 * 
 */
public class Program2_SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="ABCD123E5";
    int sum=0;
    
    for(int i=0;i<=str.length()-1;i++) {
    	char ch=str.charAt(i);
    	if(Character.isDigit(ch)) {
    		
    		sum +=Integer.parseInt(ch+"");
    	}
    }
    System.out.println("sum of digits " + sum);
	}

}
