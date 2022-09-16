package mavenReportsCristianStefan.TestNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = "Smoke")
	public void Day1() {
		System.out.println("Ce faci?");
	}
	
	@Test
	public void Day2() {
		System.out.println("Ca va?");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("I will be executed first");
	}
}
