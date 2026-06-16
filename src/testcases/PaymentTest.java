package testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class PaymentTest {

	
	@Test(retryAnalyzer=ReRun.class)
	void paid() {
		
		System.out.println("Testcase Started");
		int num=10/0;
		System.out.println("Paid");
		
	}
	
/*	@Test(groups= {"smoke"})
	void unpaid() {
		boolean value=false;
		//Assert.assertTrue(value);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(value);
		System.out.println("UnPaid");
		soft.assertAll();
	}*/
}
