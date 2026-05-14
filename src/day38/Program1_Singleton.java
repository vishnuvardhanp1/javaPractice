/**
 * 
 */
package day38;
class Demo {
	private static Demo obj;
	private Demo() {
		
	}
	static Demo getObj() {
		if(obj  == null) {
			obj=new Demo();
			return obj;
		} else { return obj; }
	}
}
/**
 * 
 */
public class Program1_Singleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo obj1=Demo.getObj();
      Demo obj2=Demo.getObj();
      if(obj1 == obj2) {
    	  System.out.println("Same Object");
      }
      
      
	}

}
