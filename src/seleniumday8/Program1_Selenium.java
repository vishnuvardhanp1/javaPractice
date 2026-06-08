/**
 * 
 */
package seleniumday8;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 */
public class Program1_Selenium {

	/**
	 * @param args
	 * @throws Exception 
	 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.geeksforgeeks.org");
	    Thread.sleep(2000);
	    File src=driver.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("./Screenshot.jpg"));
	    
	    
	}

}
