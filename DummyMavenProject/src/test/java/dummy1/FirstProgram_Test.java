package dummy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgram_Test {
	@Test
	public void test() {
		WebDriver driver =new ChromeDriver();
		Reporter.log("Test class is Executed", true);
	}
	
}