package mavenReportsCristianStefan.TestNGTutorial;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebLoginHomeLoan() {
		// Selenium
		System.out.println("WebLoginHomeLoan");
	}

	@Test(groups = "Smoke")
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.println("MobileLoginHomeLoan");
	}

	@Test
	public void LogInAPIhomeLoan() {
		// Rest API automation
		System.out.println("LogInAPIhomeLoan");



	}
}
