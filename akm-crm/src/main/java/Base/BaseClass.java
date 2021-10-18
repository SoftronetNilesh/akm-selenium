package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
		driver = new ChromeDriver();
	}

	@Test
	public void sampletest() {
		driver.get("https://akmcrmqa-apps.deeccus.com/app/index.html#/login");
	}
}
