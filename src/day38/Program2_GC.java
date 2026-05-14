/**
 * 
 */
package day38;

/**
 * 
 */
public class Program2_GC {
	int num;
  protected void finalize() throws Throwable {
	  System.out.println("GC is called");
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2_GC obj=new Program2_GC();
		Program2_GC obj1=obj;
		obj1.num=10;
		obj=null;
		obj1=null;
		System.gc();
		
	}

}
