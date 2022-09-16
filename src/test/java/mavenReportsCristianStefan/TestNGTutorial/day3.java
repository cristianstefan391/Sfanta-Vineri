package mavenReportsCristianStefan.TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day3 {

	@BeforeMethod

	public void beforeMethod() {
		System.out.println("I will be executed before method");
	}

	@Test
	public void WebLoginCarLoan() {
		// Selenium
		System.out.println("WebLoginCarLoan");

		System.out.println("Care Bobita, domnule?");

		System.out.println("Cristian Stefan 31");
		System.out.println("Cristian Stefan 52");

	}

	@Test(timeOut = 4000)
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileLoginCarLoan");
	}

	@Test(enabled = false)
	public void MobileSignInLoan() {
		// Appium
		System.out.println("MobileSignInLoan");
	}

	@Test
	public void MobileSignOut() {
		// Appium
		System.out.println("MobileSignOut");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite");
	}

	@Test(groups = "Smoke", dependsOnMethods = { "WebLoginCarLoan" })
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("LogInAPIcarLoan");
	}

	@Test

	public void cristianParams() {
		// Selenium
		System.out.println("WebLoginCarLoan");

	}
	
	@Test
	public void WebLoginHomeLoan6() {
		// Selenium
		System.out.println("New Branch #3");
	}
	
	@Test
	public void WebLoginHomeLoan7() {
		// Selenium
		System.out.println("New Branch #4");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I will be executed after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing any method on a class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After executing any method on a class");
	}

}
