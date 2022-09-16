package mavenReportsCristianStefan.TestNGTutorial;

import java.net.PasswordAuthentication;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.ITestResultNotifier;

public class day5 {

	@DataProvider
	public Object[][] getData() {
		// 1 Scenario : username, password with a good credit history
		// 2 Scenario : username, password with no credit history
		// 3 Scenario : username, password with a bad credit history

		// By using an arrayList
		// Scenarios tested:3, Combinations: 2
		// Defining multidimensional object array
		Object[][] data = new Object[3][2];

		// 1 Scenario
		data[0][0] = "firstScenarioUserName";
		data[0][1] = "password";

		// 2 Scenario
		data[1][0] = "secondScenarioUserName";
		data[1][1] = "secondPassword";

		// 3 Scenario
		data[2][0] = "thirdScenarioUserName";
		data[2][1] = "thirdPassword";

		return data;
	}

	@Test(dataProvider = "getData")
	public void WebLoginHomeLoan4(String userName, String password) {
		// Selenium
		System.out.println("WebLoginHomeLoan");
		System.out.println(userName);
		System.out.println(password);
	}

	@Parameters({ "url", "day" })
	@Test

	public void MobileLoginHomeLoan4(String url, String day) {
		// Appium
		System.out.println(url);
		System.out.println("MobileLoginHomeLoan");
		System.out.println(day);
		System.out.println("Testing GIT");
System.out.println("Testing GIT Second Time");
	}

	@Test
	public void LogInAPIhomeLoan5() {
		// Rest API automation
		System.out.println("LogInAPIhomeLoan");
		Assert.assertTrue(false);

	}
	
	@Test
	public void WebLoginHomeLoan4() {
		// Selenium
		System.out.println("New Branch #1");
	}
	
	
	@Test
	public void WebLoginHomeLoan5() {
		// Selenium
		System.out.println("New Branch #2");

	}
	

	@Test
	public void WebLoginHomeLoan6() {
		// Selenium
		System.out.println("New Branch #12");
	}
}


