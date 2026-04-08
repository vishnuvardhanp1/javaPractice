/**
 * 
 */
package day13;

/**
 * 
 */
public class Program1_DigitProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=57243;
    String newNum="";
    int pos=0;
    while(num > 0) {
    	pos++;
    	int lastDigit=num%10;
    	if(pos%2 !=0  && lastDigit <= 4) {
    		
    		newNum=newNum+""+(lastDigit*2);
    		
    	} else if(pos%2 !=0 && lastDigit > 4) {
    		newNum=newNum+ "" + lastDigit;
    	} else if(pos%2 == 0){
    		newNum=newNum+""+1;
    		
    	}
    	num=num/10;
    }
    System.out.println(newNum);
    StringBuilder sb=new StringBuilder(newNum);
    sb.reverse();
    int newNumber=Integer.parseInt(sb + "");
    		
    System.out.println(newNumber);
	}

}
