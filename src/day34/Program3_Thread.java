/**
 * 
 */
package day34;

//import org.openqa.selenium.chrome.ChromeDriver;

class MyThread extends Thread {
	
	@Override
	 public void run() {
		 System.out.println(Thread.currentThread().getId());
		// ChromeDriver  chromeDriver=new ChromeDriver();
	 }
}
/**
 * 
 */
public class Program3_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=10;i++) {
    	 MyThread obj=new MyThread();
    	 obj.start();
     }
	}

}
