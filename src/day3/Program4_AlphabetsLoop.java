/**
 * 
 */
package day3;

/**
 * 
 */
public class Program4_AlphabetsLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char capital='A';
     char small='a';
     //mycode
     int i=0;
     while(i<26) {
    	 System.out.print(capital);
    	 System.out.print(small +"\n");
    	 capital++;
    	 small++;
    	 i++;
     }
     //trainer code
     while(capital <= 'Z') {
    	 System.out.println(capital+""+small);
    	 capital++;
    	 small++;
     }
	}

}
