/**
 * 
 */
package seleniumday9;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 */
public class Program7_BrowserNotification {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    
	   ChromeOptions opt=new ChromeOptions();
	    Map<String,Object> prefs=new HashMap<>();
	 /*   prefs.put("profile.default_content_setting_values.notifications", 2);
	    opt.setExperimentalOption("prefs", prefs);*/
	    ChromeDriver driver=new ChromeDriver(opt);
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.spicejet.com/");
	    Thread.sleep(2000);
	}

}
