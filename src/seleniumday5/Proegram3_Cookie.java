/**
 * 
 */
package seleniumday5;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 */
public class Proegram3_Cookie {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.geeksforgeeks.org");
	    Thread.sleep(8000);
	    Cookie c1=new Cookie("keyA","valueA");
	    driver.manage().addCookie(c1);
	    Set<Cookie> cookies=driver.manage().getCookies();
	    for(Cookie c:cookies) {
	    	System.out.println(c.getName() + ":" + c.getValue());
	    }
	    driver.manage().deleteCookie(c1);
	    driver.manage().deleteCookieNamed("gfg_theme");
	    System.out.println("***************");
	    cookies=driver.manage().getCookies();
	    for(Cookie c:cookies) {
	    	System.out.println(c.getName() + ":" + c.getValue());
	    }
	}

}
