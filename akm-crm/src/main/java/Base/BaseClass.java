package Base;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class BaseClass {
	public static WebDriver driver;
	public static JavascriptExecutor javascriptExecutor;
	public static WebDriverWait wait;
	public static void initialisation() {
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://akmcrmqa-apps.deeccus.com/app/index.html#/login");
		driver.manage().window().maximize();
		javascriptExecutor = (JavascriptExecutor)driver;
		wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
}
