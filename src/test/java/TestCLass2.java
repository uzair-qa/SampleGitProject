import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCLass2 {

	@Test
	public void testMthod2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
