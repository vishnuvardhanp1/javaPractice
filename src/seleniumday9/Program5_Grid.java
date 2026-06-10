/**
 * 
 */
package seleniumday9;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * 
 */
public class Program5_Grid {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    ChromeOptions opt=new ChromeOptions();
    opt.setCapability("platformName", "Windows");
    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), opt);
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
   // driver.quit();
	}

}
