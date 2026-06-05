/**
 * 
 */
package seleniumday7;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
/**
 * 
 */
public class Program2_ValidateLinks {

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
	    driver.get("https://www.engineerdiaries.com/selenium");
	    Thread.sleep(2000);
	    List<WebElement> links=driver.findElements(By.xpath("//footer//a"));
	    for(WebElement link:links) {
	    	String href = link.getAttribute("href");
	    	 int responseCode=0;
	    	if(href.startsWith("mailto"))
	    	{
	    	    System.out.println("Email Link : " + href);
	    	    
	    	}
	    	else
	    	{
	    	    URL url = new URL(href);

	    	    HttpURLConnection con =
	    	    (HttpURLConnection) url.openConnection();
	    	    con.setRequestMethod("GET");

		        responseCode = con.getResponseCode();
	    	    System.out.println(con.getResponseCode());
	    	    con.disconnect();
	    	}
	    /*	URL url = new URL(link.getAttribute("href"));
		    HttpURLConnection con =
	                (HttpURLConnection) url.openConnection(); */

	        

	        System.out.println("Response Code : " + responseCode);

	        if(responseCode == 404)
	        {
	            System.out.println(link.getText()+"Link is not working");
	        }
	        else
	        {
	            System.out.println(link.getText()+"link is working");
	        }

	        
	    	System.out.println(link.getText());
	    }
	    
	}

}
