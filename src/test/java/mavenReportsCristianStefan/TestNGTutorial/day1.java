package mavenReportsCristianStefan.TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Day1() {
		System.out.println("Bonjour");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I will be exectuted after suite");
	}
	
	@Test(groups = "Smoke")
	public void Day2() {
		System.out.println("Salutare");
	}
	
@Test
public void Demo() {
	System.out.println("This is a new test");
}
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I will be executed at the end");
	}

}
