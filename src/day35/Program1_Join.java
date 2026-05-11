/**
 * 
 */
package day35;

class MyThread extends Thread {
	volatile int num=10;
	@Override
	public void run() {
		System.out.println("bye");
	}
}
/**
 * 
 */
public class Program1_Join {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.out.println("hello");
   MyThread myThread=new MyThread();
   myThread.start();
   //main should wait until t1 complete
   myThread.join();
   System.out.println("thank you");
   
	}

}
