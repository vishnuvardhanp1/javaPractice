/**
 * 
 */
package day37;

class Demo2<Generic> {
void getData(Generic value) {
	System.out.println(value);
}
}
/**
 * 
 */
public class Program2_Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo2<String>  obj1=new Demo2<String>();
      obj1.getData("hello");
      Demo2<Integer>  obj2=new Demo2<Integer>();
      obj2.getData(10);
      Demo2<Boolean>  obj3=new Demo2<Boolean>();
      obj3.getData(false);
	}

}
