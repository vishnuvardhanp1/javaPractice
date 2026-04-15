/**
 * 
 */
package day16;

import day17.TestAccess;

/**
 * 
 */
public class Program3_Super extends TestAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TestAccess testAccess=new TestAccess();
	    //testAccess. no default access modiifer accsisible from day17
	    testAccess.publicNum=50;
	    Program3_Super program3_super=new Program3_Super();
	    program3_super.protectedNum=60;
	}

}
