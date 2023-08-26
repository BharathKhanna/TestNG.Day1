package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	ChromeDriver driver;

	@BeforeMethod
	public void setup() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		driver = new ChromeDriver(co);
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//Find the username and enter username value
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the password field and enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();

}

}
