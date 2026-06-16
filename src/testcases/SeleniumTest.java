/**
 * 
 */
package testcases;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.*;

/**
 * 
 */
public class SeleniumTest {
ChromeDriver driver;
@BeforeMethod
void setup()  throws Exception {
	driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}

@AfterMethod
void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
}

@Test
void methodA() throws Exception {
	Properties prop=new Properties();
	prop.load(new FileInputStream("C:\\Users\\VISHNU VARDHAN\\eclipse-workspace\\GrowSkillIT\\src\\testcases\\data.properties"));
	driver.get(prop.getProperty("url") + "/selenium");
}

@Test
void methodB() {
	 driver.get("https://www.geeksforgeeks.org");
}
}
