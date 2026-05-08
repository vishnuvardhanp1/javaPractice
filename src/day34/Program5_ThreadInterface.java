/**
 * 
 */
package day34;
class MyThreadA implements Runnable {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId());
	}
	
}
/**
 * 
 */
public class Program5_ThreadInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=10;i++) {
    	MyThreadA myThreadA=new MyThreadA();
    	Thread t1=new Thread(myThreadA);
    	t1.start();
    }
	}

}
