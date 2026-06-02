/**
 * 
 */
package seleniumday4;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Program3_Tabs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WebDriver driver=new ChromeDriver();
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.get("https://www.engineerdiaries.com/selenium");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[text()='Open Google']")).click();
		    Thread.sleep(2000);
		    Set<String> windows=driver.getWindowHandles();
		    
		    Iterator<String> it=windows.iterator();
		   // String googleWin=windows.
		    String mainWin=it.next();
		    System.out.println("Mainwin : " + mainWin);
		    driver.switchTo().window(mainWin);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[text()='Open Facebook']")).click();
		    Thread.sleep(2000);
		    windows=driver.getWindowHandles();
		    for(String win:windows) {
		    	driver.switchTo().window(win);
		    	Thread.sleep(2000);
		    	String title=driver.getTitle();
		    	if(title.contains("Google")) {
		    		driver.close();
		    	}
		    }
		    windows=driver.getWindowHandles();
		    for(String win:windows) {
		    	driver.switchTo().window(win);
		    	Thread.sleep(2000);
		    	String title=driver.getTitle();
		    	if(title.contains("Facebook")) {
		    		driver.close();
		    	}
		    }
		    windows=driver.getWindowHandles();
		    it=windows.iterator();
		    mainWin=it.next();
		    Thread.sleep(2000);
		    driver.switchTo().window(mainWin);
		    Thread.sleep(2000);
		    driver.close();
		    System.out.println("code is success");
		    
		    
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
