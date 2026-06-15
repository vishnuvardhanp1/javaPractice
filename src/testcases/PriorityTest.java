package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTest {
	@BeforeSuite
	void beforeSuite() {
	System.out.println("Before suite");	
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("After suite");		
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("after Test");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("after Class");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("after Method");
	}
	@Test(priority=0)
	void methodC() {
		System.out.println("Method C");
	}
	@Test(groups = {"smoke"})
	public void methodA() {
		System.out.println("Method A");
	}
	
	@Test(priority=1)
	void methodB() {
		System.out.println("Method B");
	}
}
